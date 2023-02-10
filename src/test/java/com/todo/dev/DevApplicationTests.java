package com.todo.dev;

import com.todo.dev.domain.dto.Members;
import com.todo.dev.domain.request.LoginRequest;
import com.todo.dev.repository.MembersRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevApplicationTests {

	@Autowired
	MembersRepository membersRepository;
	@Test
	void contextLoads() {

	}
	@Test
	void loginTest() {
		LoginRequest request = new LoginRequest("park", "1234");
		Members findMember = membersRepository.findByIdAndPw(request);
		System.out.println(findMember.toString());
	}

}
