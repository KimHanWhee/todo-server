package com.todo.dev.domain.response;

import com.todo.dev.domain.dto.Todos;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class HomeTodosResponse {
    private final LocalDateTime create_date;
    private final String content;
    private final Boolean checked;

    public HomeTodosResponse(Todos todos){
        this.create_date = todos.getCreate_date();
        this.content = todos.getContent();
        this.checked = todos.getChecked();
    }
}
