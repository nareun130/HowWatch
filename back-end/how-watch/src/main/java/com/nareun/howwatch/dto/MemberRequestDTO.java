package com.nareun.howwatch.dto;

import com.nareun.howwatch.domain.Member;
import com.nareun.howwatch.domain.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequestDTO {
	//* 이 부분이 db에서 int 값이라서 어떻게 처리해야 하면 좋을까 
	private int admin;
	private String email;
	private String phone_number;
	private String name;
	private String password;
	
	public Member toEntity() {
		return Member.builder()
				.admin(this.admin)
				.email(this.email)
				.phone_number(this.phone_number)
				.name(this.name)
				.password(this.password)
				.build();
	}
	
}
