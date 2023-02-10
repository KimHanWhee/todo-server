package com.todo.dev.service;

import com.todo.dev.domain.dto.Members;
import com.todo.dev.domain.request.LoginRequest;
import com.todo.dev.domain.request.SignUpRequest;
import com.todo.dev.domain.response.MemberResponse;
import com.todo.dev.repository.MembersRepository;
import com.todo.dev.security.SecurityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class MembersService {
    private final MembersRepository membersRepository;
    private final SecurityService securityService;

    public MemberResponse loginService(LoginRequest request){
        Members loginMember = membersRepository.findByIdAndPw(request);
        if(loginMember.getMember_id() != null) {
            String token = securityService.createToken(loginMember);
            return new MemberResponse(
                    loginMember.getId(),
                    loginMember.getName(),
                    loginMember.getPhone_number(),
                    token
            );
        }
        return null;
    }

    public MemberResponse signUpService(SignUpRequest request){
        Integer insertId = membersRepository.insertMembers(request);
        if(insertId!=null){
            LoginRequest loginRequest = new LoginRequest(request.getMember_id(), request.getMember_pw());
            return loginService(loginRequest);
        }
        return null;
    }

}
