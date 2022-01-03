package com.example.movie_review.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 별도의 화면 없이 데이터를 전송
public class SampleController {

    @GetMapping("/hello")
    public String[] hello(){
        return new String[]{"hello", "world"};
    }
}
