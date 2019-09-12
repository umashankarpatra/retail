package com.retail.model;

public class ShoppingAmount {

	public Double amount;

	public String shoppingType;

	public ShoppingAmount(Double amount, String shoppingType) {
		super();
		this.amount = amount;
		this.shoppingType = shoppingType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getShoppingType() {
		return shoppingType;
	}

	public void setShoppingType(String shoppingType) {
		this.shoppingType = shoppingType;
	}

}
