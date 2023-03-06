package com.example.springbootregex.controller;

import com.example.springbootregex.dto.UserRequest;
import com.example.springbootregex.dto.UserResponse;
import com.example.springbootregex.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regex")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(userService.createUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("/userList")
    public ResponseEntity<List<UserResponse>> getAllUserList() {
        return new ResponseEntity<>(userService.gelAllUserList(), HttpStatus.OK);
    }

}
