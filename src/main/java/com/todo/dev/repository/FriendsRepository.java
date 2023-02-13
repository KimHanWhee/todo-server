package com.todo.dev.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FriendsRepository {
    Integer insertFriend(Integer myId, Integer targetId);
}
