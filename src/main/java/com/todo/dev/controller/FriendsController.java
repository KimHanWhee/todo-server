package com.todo.dev.controller;

import com.todo.dev.security.SecurityService;
import com.todo.dev.security.TokenRequired;
import com.todo.dev.service.FriendsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/friends")
public class FriendsController {

    private final SecurityService securityService;
    private final FriendsService friendsService;

    @PostMapping("/{targetId}") @TokenRequired
    public Integer insertFriend(@PathVariable("targetId") Integer targetId){
        Integer myId = securityService.parseToken(securityService.getToken()).getId();
        return friendsService.insertFriend(myId, targetId);
    }
}
