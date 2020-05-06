package com.star.sud.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.star.sud.bean.TechnologyDetails;

public interface ShoppingCartService {
	@Secured("ROLE_USER")
	int placeOrder(TechnologyDetails order);

	@Secured("ROLE_ADMIN")
	List<TechnologyDetails> getOrderList();
}