package com.nareun.howwatch.dto;

import com.nareun.howwatch.domain.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponseDTO {
	private String token_type;
	private String access_token;
	private String refresh_token;

	@Builder
	public AuthResponseDTO(Auth auth) {
		this.token_type = auth.getToken_type();
		this.access_token = auth.getAccess_token();
		this.refresh_token = auth.getRefresh_token();
	}
}
