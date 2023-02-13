package com.todo.dev.domain.response;

import com.todo.dev.domain.entity.Todos;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class HomeTodosResponse {
    private final LocalDateTime createDate;
    private final String content;
    private final Boolean checked;

    public HomeTodosResponse(Todos todos){
        this.createDate = todos.getCreateDate();
        this.content = todos.getContent();
        this.checked = todos.getChecked();
    }
}
