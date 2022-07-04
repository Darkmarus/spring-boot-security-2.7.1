package com.argentina.example.rest.response;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@RequiredArgsConstructor
public class JwtResponse implements Serializable {
    @NonNull
    private String token;
    private String type = "Bearer";
    @NonNull
    private String username;
    @NonNull
    private String email;
}
