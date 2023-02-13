package com.todo.dev.controller;

import com.todo.dev.domain.dto.FriendTodos;
import com.todo.dev.domain.dto.TodoPost;
import com.todo.dev.domain.request.TodosPostRequest;
import com.todo.dev.domain.response.HomeTodosResponse;
import com.todo.dev.domain.response.MyTodoResponse;
import com.todo.dev.security.SecurityService;
import com.todo.dev.security.TokenRequired;
import com.todo.dev.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodosController {
    private final TodoService todoService;
    private final SecurityService securityService;

    @PostMapping @TokenRequired
    public Integer postTodos(@RequestBody TodosPostRequest request){
        Integer member_id = securityService.parseToken(securityService.getToken()).getId();
        TodoPost todoPost = TodoPost.builder()
                .memberId(member_id).content(request.getContent())
                .build();
        return todoService.insertTodoService(todoPost);
    }

    @PutMapping("/{id}") @TokenRequired
    public Integer checkTodos(@PathVariable("id") Integer id){
        Integer member_id = securityService.parseToken(securityService.getToken()).getId();
        return todoService.checkTodo(id, member_id);
    }

    @GetMapping("/home") @TokenRequired
    public List<HomeTodosResponse> homeTodos(){
        return todoService.homeTodos(securityService.parseToken(securityService.getToken()).getId());
    }
    @GetMapping("/my") @TokenRequired
    public List<MyTodoResponse> myTodos(){
        return todoService.myTodos(securityService.parseToken(securityService.getToken()).getId());
    }
    @GetMapping("/friend") @TokenRequired
    public List<FriendTodos> getMyFriendTodos(){
        System.out.println(securityService.parseToken(securityService.getToken()).getId());
        return todoService.getFriendTodos(securityService.parseToken(securityService.getToken()).getId());
    }
}
