package com.example.springbootregex.service;

import com.example.springbootregex.dto.UserRequest;
import com.example.springbootregex.dto.UserResponse;
import com.example.springbootregex.exception.UserNameAlreadyAvailableException;
import com.example.springbootregex.model.User;
import com.example.springbootregex.repository.UserRepository;
import com.example.springbootregex.utils.RegexUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserResponse createUser(UserRequest userRequest) {

        User user = new User();

        if (userRepository.existsByUserName(userRequest.getUserName())) {
            log.error("Kullanıcı Adı Zaten Mevcut ! ");
            throw new UserNameAlreadyAvailableException("Kullanıcı Adı Zaten Mevcut ! ");
        }
        user.setUserName(RegexUtils.usernameRegex(userRequest.getUserName()));
        user.setPassword(RegexUtils.passwordRegex(userRequest.getPassword()));
        user.setEmail(RegexUtils.emailRegex(userRequest.getEmail()));
        userRepository.save(user);
        log.info("Kullanıcı başarılı bir şekilde kaydedildi.");

        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setUserName(user.getUserName());
        userResponse.setPassword(user.getPassword());
        userResponse.setEmail(user.getEmail());

        return userResponse;
    }

    @Override
    public List<UserResponse> gelAllUserList() {

        List<UserResponse> userResponseList = new ArrayList<>();
        List<User> userList = userRepository.findAll();

        for (User user : userList) {
            UserResponse userResponse = new UserResponse();
            userResponse.setId(user.getId());
            userResponse.setUserName(user.getUserName());
            userResponse.setEmail(user.getEmail());
            userResponse.setPassword(user.getPassword());
            userResponseList.add(userResponse);
        }
        return userResponseList;
    }
}
