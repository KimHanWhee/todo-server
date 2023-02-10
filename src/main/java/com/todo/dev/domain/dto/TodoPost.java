package com.todo.dev.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class TodoPost {
    private Integer member_id;
    private String content;

    public Todos toDTO(){
        return Todos.builder()
                .member_id(member_id)
                .content(content)
                .build();
    }
}
