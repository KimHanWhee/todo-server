package com.todo.dev.domain.entity;

import com.todo.dev.domain.request.SignUpRequest;
import lombok.*;

@Getter @ToString
@AllArgsConstructor @NoArgsConstructor
@Builder
public class Members {
    private Integer id;
    private String memberId;
    private String memberPw;
    private String name;
    private String phoneNumber;

    public Members(Integer id, SignUpRequest request){
        this.id = id;
        this.memberId = request.getMemberId();
        this.memberPw = request.getMemberPw();
        this.name = request.getName();
        this.phoneNumber = request.getPhoneNumber();
    }
}
