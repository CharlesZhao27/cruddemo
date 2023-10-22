package com.example.cruddemo.mapper;

import com.example.cruddemo.dto.UserGetDto;
import com.example.cruddemo.model.UserInfo;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserGetDto mapUserInfoToUserGetDto(UserInfo savedUser) {

        return UserGetDto.builder()
                .email(savedUser.getEmail())
                .name(savedUser.getName())
                .id(savedUser.getId())
                .createdTime(savedUser.getCreated_time())
                .updatedTime(savedUser.getUpdated_time())
                .build();
    }
}
