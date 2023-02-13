package com.todo.dev.service;

import com.todo.dev.domain.dto.TodoPost;
import com.todo.dev.domain.dto.Todos;
import com.todo.dev.domain.request.TodosPostRequest;
import com.todo.dev.domain.response.HomeTodosResponse;
import com.todo.dev.repository.TodosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodosRepository todosRepository;
    public Integer insertTodoService(TodoPost todoPost){
        Todos dto = todoPost.toDTO();
        Integer insertRows = todosRepository.insert(dto);
        if(insertRows!=0){
            return dto.getId();
        }
        return 0;
    }

    public Integer checkTodo(Integer id, Integer member_id){
        if(todosRepository.check(id, member_id) == 1){
            return id;
        }
        return 0;
    }
    public List<HomeTodosResponse> homeTodos(Integer member_id){
        List<Todos> todos = todosRepository.allTodos(member_id);
        return todos.stream()
                .map(HomeTodosResponse::new)
                .collect(Collectors.toList());
    }
}
