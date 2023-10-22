package com.example.cruddemo.dto;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

/**
 * 后端给前端传回的Data Transfer Object
 * */
@Data
@Builder
public class UserGetDto {
    private long id;
    private String name;
    private String email;
    private OffsetDateTime createdTime;
    private OffsetDateTime updatedTime;
}
