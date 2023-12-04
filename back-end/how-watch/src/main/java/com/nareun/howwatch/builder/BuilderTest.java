package com.nareun.howwatch.builder;

public class BuilderTest {
	public static void main(String[] args) {
		User user = User.builder()
						.age(10)
						.iq(120)
						.height(150)
						.name("hello")
						.build();
		
		System.out.println(user);
	}

}
