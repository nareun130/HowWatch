package com.nareun.howwatch.domain;

import java.util.Arrays;

public class RoleTest {
	public static void main(String[] args) {
		String user = Role.ROLE_USER.toString();
//		String admin = Role.ROLE_ADMIN.toString();
		System.out.println(user);
		
		
		System.out.println(Role.values());
		
		System.out.println(Role.ROLE_ADMIN.getValue());
	}
}
