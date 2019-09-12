package com.retail.model;

import java.util.List;

public class OrderRequest {

	public List<ShoppingAmount> shoppingAmount;

	public String userType;

	public Integer userDurations;

	public OrderRequest(List<ShoppingAmount> shoppingAmount, String userType, Integer userDurations) {
		super();
		this.shoppingAmount = shoppingAmount;
		this.userType = userType;
		this.userDurations = userDurations;

	}

	public List<ShoppingAmount> getShoppingAmount() {
		return shoppingAmount;
	}

	public void setShoppingAmount(List<ShoppingAmount> shoppingAmount) {
		this.shoppingAmount = shoppingAmount;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Integer getUserDurations() {
		return userDurations;
	}

	public void setUserDurations(Integer userDurations) {
		this.userDurations = userDurations;
	}

}
