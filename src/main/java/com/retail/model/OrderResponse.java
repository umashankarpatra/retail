package com.retail.model;

import com.retail.discountstrategy.AffilliateDiscountStrategy;
import com.retail.discountstrategy.CustomerDiscountStrategy;
import com.retail.discountstrategy.EmployeeDiscountStrategy;
import com.retail.enums.UserType;
import com.retail.exceptions.RetailException;

public class OrderResponse {

	public Double totalAmount;
	public Double payAbleAmount;

	public OrderResponse(Double totalAmount, Double payAbleAmount) {
		super();

		this.totalAmount = totalAmount;
		this.payAbleAmount = payAbleAmount;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getPayAbleAmount() {
		return payAbleAmount;
	}

	public void setPayAbleAmount(Double payAbleAmount) {
		this.payAbleAmount = payAbleAmount;
	}

	public static OrderResponse getOrderResponse(OrderRequest orderRequest) throws RetailException {
		if (orderRequest.getUserType().equals(UserType.EMPLOYEE.getValue())) {

			EmployeeDiscountStrategy employeeDiscountStrategy = new EmployeeDiscountStrategy();

			OrderResponse orderResponse = employeeDiscountStrategy.calculateDiscount(orderRequest);

			return orderResponse;

		} else if (orderRequest.getUserType().equals(UserType.AFFILIATE.getValue())) {

			AffilliateDiscountStrategy affilliateDiscountStrategy = new AffilliateDiscountStrategy();

			OrderResponse orderResponse = affilliateDiscountStrategy.calculateDiscount(orderRequest);

			return orderResponse;

		} else if (orderRequest.getUserType().equals(UserType.CUSTOMER.getValue())) {

			CustomerDiscountStrategy customerDiscountStrategy = new CustomerDiscountStrategy();

			OrderResponse orderResponse = customerDiscountStrategy.calculateDiscount(orderRequest);

			return orderResponse;

		}

		else {
			throw new RetailException("Please provide valid User type");
		}

	}

}
