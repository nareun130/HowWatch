package com.nareun.howwatch.domain;

public enum Role {
	ROLE_USER(0), ROLE_ADMIN(1);
	
	private int value;
	
	Role(int value){
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
