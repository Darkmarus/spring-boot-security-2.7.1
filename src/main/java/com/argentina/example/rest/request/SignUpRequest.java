package com.argentina.example.rest.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SignUpRequest implements Serializable {
    private String username;
    private String email;
    private String password;
}
