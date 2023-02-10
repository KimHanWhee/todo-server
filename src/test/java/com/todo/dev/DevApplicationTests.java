package com.todo.dev;

import com.todo.dev.security.SecurityService;
import com.todo.dev.domain.dto.Members;
import com.todo.dev.domain.request.LoginRequest;
import com.todo.dev.repository.MembersRepository;
import com.todo.dev.security.TokenInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;

@SpringBootTest
class DevApplicationTests {

	@Autowired
	MembersRepository membersRepository;

	@Autowired
	SecurityService securityService;
	@Test
	void contextLoads() {

	}
	@Test
	void loginTest() {
		LoginRequest request = new LoginRequest("park", "1234");
		Members findMember = membersRepository.findByIdAndPw(request);
		System.out.println(findMember.toString());
	}

	@Test
	void valueTest(){
		Members member = new Members(1,
				"park",
				"1234",
				"park",
				"01022222222");
		String token = securityService.createToken(member);
		System.out.println(token);
	}

	@Test
	void parseTokenTest(){
		String token = "eyJhbGciOiJIUzUxMiJ9.eyJwaG9uZU51bWJlciI6IjAxMDIyMjIyMjIyIiwibmFtZSI6InBhcmsiLCJpZCI6MSwiZXhwIjoxNjc2MDAyMDA0fQ.1qZn_HF9GlBFhKN4uV_EJIllgxEYFnh03r4TclTtnXVbtv-G9kIb8CoihACg_xqeuP_yigACVCC7oG_cZd_2Ww";
		TokenInfo info = securityService.parseToken(token);
		System.out.println(info.toString());
	}

	@Test
	void builderTest(){
		Members members = Members.builder()
				.id(1)
				.member_id("park")
				.member_pw("1234")
				.name("park")
				.phone_number("01022222222")
				.build();
		System.out.println(members.toString());
	}

}
