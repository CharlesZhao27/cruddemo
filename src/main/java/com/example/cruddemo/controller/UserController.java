package com.example.cruddemo.controller;

import com.example.cruddemo.dto.UserGetDto;
import com.example.cruddemo.dto.UserPostDto;
import com.example.cruddemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    public final UserService userService;

    @PostMapping
    public UserGetDto createUser(@RequestBody UserPostDto userPostDto){
        return userService.createUser(userPostDto);
    }

    @GetMapping("/{userId}")
    public UserGetDto findUserById(@PathVariable long userId){
        return userService.findUserById(userId);
    }

    @GetMapping
    public UserGetDto findUserByEmail(@RequestParam String email){
        return  userService.findUserByEmail(email);
    }

    @DeleteMapping("/{userId}")
    public UserGetDto deleteUserById(@PathVariable long userId){
        return userService.deleteUserById(userId);
    }
}
