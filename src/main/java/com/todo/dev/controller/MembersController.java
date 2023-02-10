package com.todo.dev.controller;

import com.todo.dev.domain.request.LoginRequest;
import com.todo.dev.domain.request.SignUpRequest;
import com.todo.dev.domain.response.MemberResponse;
import com.todo.dev.service.MembersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/members")
public class MembersController {
    private final MembersService membersService;

    @PostMapping("/login")
    public MemberResponse login(@RequestBody LoginRequest loginRequest){
        return membersService.loginService(loginRequest);
    }

    @PostMapping("/signup")
    public MemberResponse signup(@RequestBody SignUpRequest signUpRequest){
        return membersService.signUpService(signUpRequest);
    }
}
