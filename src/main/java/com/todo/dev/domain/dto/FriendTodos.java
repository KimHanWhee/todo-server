package com.todo.dev.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class FriendTodos {
    private final Integer id;
    private final LocalDateTime createDate;
    private final String content;
    private final String name;
}
