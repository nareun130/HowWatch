package com.nareun.howwatch.config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenProvider {

	@Value("{jwt.secret}")
	private String jwtSecretKey;
	
	@Value("${jwt.accessTokenExpirationTime}")
	private Long jwtAccessTokenExpirationTime;
	
	@Value("${jwt.refreshTokenExpirationTime}")
	private Long jwtRefreshTokenExpriationTime;
	
	public String generateAccessToken(Authentication authentication	) {
		CustomUserDetails customUserDetails = (CustomUserDetails) authentication.getPrincipal();
		Date expiryDate = new Date(new Date().getTime()+jwtAccessTokenExpirationTime);
		return Jwts.builder()
				.setSubject(customUserDetails.getUsername())
				.claim("member-id", customUserDetails.getMemberId())
				.claim("email", customUserDetails.getEmail())
				.setIssuedAt(new Date())
				.setExpiration(expiryDate)
				.signWith(SignatureAlgorithm.HS512,jwtSecretKey)
				.compact();
	}
	
	public String generateRefreshToken(Authentication authentication	) {
		CustomUserDetails customUserDetails = (CustomUserDetails) authentication.getPrincipal();
		Date expiryDate = new Date(new Date().getTime()+jwtRefreshTokenExpriationTime);
		return Jwts.builder()
				.setSubject(customUserDetails.getUsername())
				.claim("member-id", customUserDetails.getMemberId())
				.claim("email", customUserDetails.getEmail())
				.setIssuedAt(new Date())
				.setExpiration(expiryDate)
				.signWith(SignatureAlgorithm.HS512,jwtSecretKey)
				.compact();
	}
	
	public Long getMemberIdFromToken(String token) {
		return Jwts.parser()
				.setSigningKey(jwtSecretKey)
				.build()
				.parseClaimsJwt(token)
				.getBody()
				.get("member_id", Long.class);
	}
}
