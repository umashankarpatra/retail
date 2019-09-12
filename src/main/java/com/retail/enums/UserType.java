package com.retail.enums;

public enum UserType {

	EMPLOYEE("employee"), AFFILIATE("affiliate"), CUSTOMER("customer");

	public String value;

	public String getValue() {
		return value;
	}

	UserType(String value) {
		this.value = value;
	}

}
