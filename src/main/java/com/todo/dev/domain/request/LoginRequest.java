package com.todo.dev.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class LoginRequest {
    private String member_id;
    private String member_pw;
}
