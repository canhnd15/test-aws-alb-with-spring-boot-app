package com.davidnguyen.awsalb.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class User {
    private String username;
    private String email;
}
