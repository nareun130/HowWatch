package com.nareun.howwatch.dto;

import com.nareun.howwatch.domain.Member;
import com.nareun.howwatch.domain.Role;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberResponseDTO {
	private long member_id;
	private Role admin;
	private String email;
	private String phone_number;
	private String name;

	public MemberResponseDTO(Member member) {
		this.member_id = member.getMember_id();
		this.email = member.getEmail();
		this.phone_number = member.getPhone_number();
		this.name = member.getName();
		this.admin = member.getAdmin() == 0 ? Role.ROLE_USER : Role.ROLE_ADMIN;
	}

}
