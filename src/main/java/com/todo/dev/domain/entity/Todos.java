package com.todo.dev.domain.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
public class Todos {
    private Integer id;
    private Integer memberId;
    private LocalDateTime createDate;
    private String content;
    private Boolean checked;
}
