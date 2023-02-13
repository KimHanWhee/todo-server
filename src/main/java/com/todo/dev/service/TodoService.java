package com.todo.dev.service;

import com.todo.dev.domain.dto.FriendTodos;
import com.todo.dev.domain.dto.TodoPost;
import com.todo.dev.domain.entity.Todos;
import com.todo.dev.domain.response.HomeTodosResponse;
import com.todo.dev.domain.response.MyTodoResponse;
import com.todo.dev.repository.TodosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

    public Integer checkTodo(Integer id, Integer memberId){
        if(todosRepository.check(id, memberId) == 1){
            return id;
        }
        return 0;
    }
    public List<HomeTodosResponse> homeTodos(Integer memberId){
        List<Todos> todos = todosRepository.allTodos(memberId);
        return todos.stream()
                .map(HomeTodosResponse::new)
                .collect(Collectors.toList());
    }
    public List<MyTodoResponse> myTodos(Integer memberId){
        List<Todos> todos = todosRepository.myTodos(memberId);
        return todos.stream()
                .map(MyTodoResponse::new)
                .collect(Collectors.toList());
    }
    public List<FriendTodos> getFriendTodos(Integer myId){
        return todosRepository.myFriendTodos(myId);
    }
}
