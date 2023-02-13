package com.todo.dev.domain.response;

import com.todo.dev.security.TokenInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberResponse {

    private Integer id;
    private String name;
    private String phoneNumber;
    private String token;

    public MemberResponse(String token, TokenInfo tokenInfo){
        this.id = tokenInfo.getId();
        this.name = tokenInfo.getName();
        this.phoneNumber = tokenInfo.getPhoneNumber();
        this.token = token;
    }
}
