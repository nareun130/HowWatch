package com.nareun.howwatch.domain;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter 
public class Member {
	private long member_id;
	private String email;
	private String password;
	private String name;
	private String phone_number;
	private LocalDateTime register_date;
	private int admin;
	
	@Builder
	public Member(String email, String password, String name, String phone_number, LocalDateTime register_date,
			int admin) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.phone_number = phone_number;
		this.register_date = register_date;
		this.admin = admin;
	}

}
