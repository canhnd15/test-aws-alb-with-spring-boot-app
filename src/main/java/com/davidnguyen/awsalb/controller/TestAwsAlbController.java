package com.davidnguyen.awsalb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TestAwsAlbController {

    @GetMapping("/users")
    public ResponseEntity<?> test() {
        User user1 = User.builder()
                .username("user_01")
                .email("user_01@gmail.com")
                .build();
        User user2 = User.builder()
                .username("user_02")
                .email("user_02@gmail.com")
                .build();
        User user3 = User.builder()
                .username("user_03")
                .email("user_03@gmail.com")
                .build();
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return ResponseEntity.ok(users);
    }
}
