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

	public static void main(String[] args) throws Exception {
		ShoppingAmount shoppingAmount = new ShoppingAmount(12.00, "groceries");
		ShoppingAmount shoppingAmount1 = new ShoppingAmount(13.00, "electronics");
		List<ShoppingAmount> obj = new ArrayList<ShoppingAmount>();
		obj.add(shoppingAmount);
		obj.add(shoppingAmount1);
		String userType = "employee";
		Integer userDurations = 2;

		createOrder(obj, userType, userDurations);

	}

}
