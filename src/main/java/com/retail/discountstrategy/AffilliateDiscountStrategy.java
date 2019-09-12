package com.retail.discountstrategy;

import java.util.List;

import com.retail.enums.ShoppingType;
import com.retail.model.OrderRequest;
import com.retail.model.OrderResponse;
import com.retail.model.ShoppingAmount;

public class AffilliateDiscountStrategy implements DiscountStrategy {

	private final static Integer DISCOUNT_RATE = 10;

	public OrderResponse calculateDiscount(OrderRequest orderRequest) {
		Double groceriesAmount = null;
		Double totalAmount = null;

		Double discountOne;
		Double discountTwo = null;
		Double payAbleAmount;
		List<ShoppingAmount> shoppingAmountList = orderRequest.getShoppingAmount();
		for (ShoppingAmount shoppingAmount : shoppingAmountList) {

			if (shoppingAmount.getAmount() != null) {
				totalAmount = totalAmount + shoppingAmount.getAmount();
			} else if (shoppingAmount.getShoppingType().equals(ShoppingType.GROCERIES.getValue())) {
				groceriesAmount = groceriesAmount + shoppingAmount.getAmount();
			}
		}

		discountOne = DISCOUNT_RATE / (totalAmount - groceriesAmount) * 100;
		if (totalAmount >= 100)
			discountTwo = 5.0 / 100.0 * totalAmount;

		payAbleAmount = totalAmount - (discountOne + discountTwo);
		return new OrderResponse(totalAmount, payAbleAmount);

	}

}
