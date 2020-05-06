package com.star.sud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.star.sud.bean.TechnologyDetails;
import com.star.sud.service.ShoppingCartService;

@Controller("/")
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService shoppingCartService;

	@GetMapping
	public String placeOrderPage(Model model) {
		addUserInfo(model);
		return "technology-details";
	}

	@RequestMapping("/noAccess")
	public String noAccess(Model model) {
		addUserInfo(model);
		return "no-access";
	}

	@RequestMapping(value = "technologyAdd", method = RequestMethod.POST)
	public String addOrderItem(TechnologyDetails orderItem, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		orderItem.setUser(auth.getName());
		shoppingCartService.placeOrder(orderItem);
		model.addAttribute("status", "Technology Added ," + orderItem);
		addUserInfo(model);
		return "tech-status";
	}

	@RequestMapping(value = "viewTechnologies", method = RequestMethod.GET)
	public String getOrderItemList(Model model) {
		addUserInfo(model);
		model.addAttribute("technologyLst", shoppingCartService.getOrderList().toString());
		return "tech-list";
	}

	private void addUserInfo(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		model.addAttribute("userInfo", String.format("Name- %s, Role- %s", auth.getName(), auth.getAuthorities()));
	}
}