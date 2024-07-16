package com.example.day0715;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String username;
    private String email;
    private boolean admin;
    private boolean person;
    private String name;
}
