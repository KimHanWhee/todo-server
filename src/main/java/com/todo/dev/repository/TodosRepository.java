package com.todo.dev.repository;

import com.todo.dev.domain.dto.TodoPost;
import com.todo.dev.domain.dto.Todos;
import com.todo.dev.domain.request.TodosPostRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodosRepository {
    Integer insert(Todos todos);
    Integer check(Integer id, Integer member_id);
    List<Todos> allTodos(Integer member_id);
}
