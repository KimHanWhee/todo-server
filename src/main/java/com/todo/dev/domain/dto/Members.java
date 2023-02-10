package com.todo.dev.domain.dto;

import com.todo.dev.domain.request.SignUpRequest;
import lombok.*;

@Getter @ToString
@AllArgsConstructor @NoArgsConstructor
@Builder
public class Members {
    private Integer id;
    private String member_id;
    private String member_pw;
    private String name;
    private String phone_number;

    public Members(Integer id, SignUpRequest request){
        this.id = id;
        this.member_id = request.getMember_id();
        this.member_pw = request.getMember_pw();
        this.name = request.getName();
        this.phone_number = request.getPhone_number();
    }
}
