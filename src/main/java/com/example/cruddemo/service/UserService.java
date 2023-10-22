package com.example.cruddemo.service;

import com.example.cruddemo.dto.UserGetDto;
import com.example.cruddemo.dto.UserPostDto;
import com.example.cruddemo.mapper.UserMapper;
import com.example.cruddemo.model.UserInfo;
import com.example.cruddemo.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;
    private final UserInfoRepository userInfoRepository;
    public UserGetDto createUser(UserPostDto userPostDto){

        //create UserInfo object
        UserInfo userInfo = new UserInfo();
        userInfo.setName(userPostDto.getName());
        userInfo.setEmail(userPostDto.getEmail());
        userInfo.setPassword(userPostDto.getPassword());

        //save Entity into database
        UserInfo savedUser = userInfoRepository.save(userInfo);

        //generate UserGetDto and return to User
        return userMapper.mapUserInfoToUserGetDto(savedUser);
    }


    public UserGetDto findUserById(long userId) {
        UserInfo savedUser = userInfoRepository.findByIdAAndDeleted(userId, false).get();

        //generate UserGetDto and return to User
        return userMapper.mapUserInfoToUserGetDto(savedUser);
    }

    public UserGetDto findUserByEmail(String email) {
        UserInfo savedUser = userInfoRepository.findByEmail(email).get();

        //generate UserGetDto and return to User
        return userMapper.mapUserInfoToUserGetDto(savedUser);
    }

    public UserGetDto deleteUserById(long userId) {

        UserInfo user = userInfoRepository.findById(userId).get();
        user.setDeleted(true);

        //generate UserGetDto and return to User
        return userMapper.mapUserInfoToUserGetDto(user);

    }
}
