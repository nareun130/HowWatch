package com.nareun.howwatch.builder;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class User {
	private final String name;
	private final int age;
	private final int height;
	private final int iq;

	@Override
	public String toString() {

		return "이름 : " + name + ", 나이 : " + age + ", 키 : " + height + ", iq : " + iq;
	}
}
