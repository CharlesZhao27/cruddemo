package com.example.cruddemo.dto;

import lombok.Data;

/**
 * Data Transfer Object from front-end to service-side
 * */
@Data
public class UserPostDto {
    private String name;
    private String email;
    private String password;
}
