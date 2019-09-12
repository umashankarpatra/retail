package com.retail.discountstrategy;

import java.util.List;

import com.retail.model.OrderRequest;
import com.retail.model.OrderResponse;
import com.retail.model.ShoppingAmount;

public class CustomerDiscountStrategy implements DiscountStrategy {

	public OrderResponse calculateDiscount(OrderRequest orderRequest) {
		Double discount = null;
		Double totalAmount = null;
		Double payAbleAmount = null;
		List<ShoppingAmount> shoppingAmountList = orderRequest.getShoppingAmount();
		if (orderRequest.userDurations > 2) {

			for (ShoppingAmount shoppingAmount : shoppingAmountList) {
				if (shoppingAmount.getAmount() != null) {
					totalAmount = totalAmount + shoppingAmount.getAmount();
				}
			}

			discount = 5.0 / 100.0 * totalAmount;
			payAbleAmount = totalAmount - discount;

		}
		return new OrderResponse(totalAmount, payAbleAmount);

	}
}
