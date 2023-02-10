package com.todo.dev.service;

import com.todo.dev.domain.dto.TodoPost;
import com.todo.dev.domain.dto.Todos;
import com.todo.dev.domain.request.TodosPostRequest;
import com.todo.dev.repository.TodosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
