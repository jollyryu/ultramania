package com.ryu.ultramania.service;


import com.ryu.ultramania.model.Member;

public interface MemberService {
	void save(Member member);
	com.ryu.ultramania.model.Member findByUserName(String username);
	com.ryu.ultramania.model.Member findByUserEmail(String email);

}
