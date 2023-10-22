package com.example.cruddemo.repository;

import com.example.cruddemo.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;
import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    Optional<UserInfo> findByEmail(String email);
    Optional<UserInfo> findByIdAAndDeleted(Long id, boolean deleted);
}


