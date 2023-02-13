package com.todo.dev.repository;

import com.todo.dev.domain.entity.Members;
import com.todo.dev.domain.request.LoginRequest;
import com.todo.dev.domain.request.SignUpRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembersRepository {

    Members findByIdAndPw(LoginRequest request);
    Integer insertMembers(SignUpRequest request);
}
