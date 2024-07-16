package com.example.day0715;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Post {
    private long id;
    private String title;
    private String content;
    private LocalDateTime createAt;
}
