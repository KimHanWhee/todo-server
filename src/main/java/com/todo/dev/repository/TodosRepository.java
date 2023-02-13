package com.todo.dev.repository;

import com.todo.dev.domain.entity.Todos;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodosRepository {
    Integer insert(Todos todos);
    Integer check(Integer id, Integer member_id);
    List<Todos> allTodos(Integer member_id);
    List<Todos> myTodos(Integer member_id);
}
