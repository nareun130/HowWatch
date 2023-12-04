package com.nareun.howwatch.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.nareun.howwatch.domain.Member;

@Mapper
@Repository
public interface MemberRepository {
	Member findByEmail(String email);
	
	
}
