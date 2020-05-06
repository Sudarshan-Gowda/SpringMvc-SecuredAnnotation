package com.star.sud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.star.sud.bean.TechnologyDetails;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
	private List<TechnologyDetails> orderItems = new ArrayList<>();

	@Override
	public int placeOrder(TechnologyDetails order) {
		int id = orderItems.size() + 1;
		order.setTechId(id);
		orderItems.add(order);
		return id;
	}

	@Override
	public List<TechnologyDetails> getOrderList() {
		return orderItems;
	}
}