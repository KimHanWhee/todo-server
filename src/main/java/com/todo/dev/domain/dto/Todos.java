package com.todo.dev.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor @NoArgsConstructor
public class Todos {
    private Integer id;
    private Integer member_id;
    private LocalDateTime create_date;
    private String content;
    private Boolean checked;
}
