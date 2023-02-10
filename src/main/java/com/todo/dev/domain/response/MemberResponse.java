package com.todo.dev.domain.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberResponse {

    private Integer id;
    private String name;
    private String phone_number;
    private String token;
}
