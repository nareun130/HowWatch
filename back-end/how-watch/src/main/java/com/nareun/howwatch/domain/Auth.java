package com.nareun.howwatch.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Auth {
	private long auth_id;
	private long member_id;
	private String token_type;
	private String access_token;
	private String refresh_token;
	
	@Builder
	public Auth( long member_id, String token_type, String access_token, String refresh_token) {
		this.member_id = member_id;
		this.token_type = token_type;
		this.access_token = access_token;
		this.refresh_token = refresh_token;
	}
	
	
}
