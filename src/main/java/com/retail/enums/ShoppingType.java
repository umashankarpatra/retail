package com.retail.enums;

public enum ShoppingType {

	GROCERIES("groceries");

	public String value;

	public String getValue() {
		return value;
	}

	ShoppingType(String value) {
		this.value = value;
	}

}
