package com.retail.discountstrategy;

import com.retail.model.OrderRequest;
import com.retail.model.OrderResponse;

public interface DiscountStrategy {

	public OrderResponse calculateDiscount(OrderRequest orderRequest);

}
