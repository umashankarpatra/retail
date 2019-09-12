package com.retail.controller;

import java.util.ArrayList;
import java.util.List;

import com.retail.exceptions.RetailException;
import com.retail.model.OrderRequest;
import com.retail.model.OrderResponse;
import com.retail.model.ShoppingAmount;

public class OrderController {

	public static OrderResponse createOrder(List<ShoppingAmount> shoppingAmount, String userType, Integer userDurations)
			throws RetailException {

		OrderRequest orderRequest = new OrderRequest(shoppingAmount, userType, userDurations);

		OrderResponse orderResponse = OrderResponse.getOrderResponse(orderRequest);

		if (orderResponse == null) {
			throw new RetailException();

		}

		return orderResponse;

	}

}
