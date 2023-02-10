package com.todo.dev.repository;

import com.todo.dev.domain.dto.Members;
import com.todo.dev.domain.request.LoginRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembersRepository {

    Members findByIdAndPw(LoginRequest request);
}
