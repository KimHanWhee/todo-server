package com.todo.dev.security;

import io.jsonwebtoken.Claims;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter @ToString
@AllArgsConstructor @NoArgsConstructor
public class TokenInfo {
    private Integer id;
    private String name;
    private String phone_number;
    public TokenInfo parseToken(Claims claims){
        Integer id = (Integer) claims.get("id");
        String name = (String) claims.get("name");
        String phone_number = (String) claims.get("phoneNumber");
        return new TokenInfo(id, name, phone_number);
    }
}
