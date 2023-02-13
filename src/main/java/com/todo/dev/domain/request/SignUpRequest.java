package com.todo.dev.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter @ToString
@AllArgsConstructor @NoArgsConstructor
public class SignUpRequest {
    private String memberId;
    private String memberPw;
    private String name;
    private String phoneNumber;
}
