package com.todo.dev.domain.response;

import com.todo.dev.security.TokenInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberResponse {

    private Integer id;
    private String name;
    private String phone_number;
    private String token;

    public MemberResponse(String token, TokenInfo tokenInfo){
        this.id = tokenInfo.getId();
        this.name = tokenInfo.getName();
        this.phone_number = tokenInfo.getPhone_number();
        this.token = token;
    }
}
