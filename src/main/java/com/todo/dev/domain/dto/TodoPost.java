package com.todo.dev.domain.dto;

import com.todo.dev.domain.entity.Todos;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class TodoPost {
    private Integer memberId;
    private String content;

    public Todos toDTO(){
        return Todos.builder()
                .memberId(memberId)
                .content(content)
                .build();
    }
}
