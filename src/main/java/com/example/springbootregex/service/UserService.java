package com.example.springbootregex.service;

import com.example.springbootregex.dto.UserRequest;
import com.example.springbootregex.dto.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest userRequest);

    List<UserResponse> gelAllUserList();
}
