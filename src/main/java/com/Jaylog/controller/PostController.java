package com.Jaylog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// SSR -> JSP, THYMELEAF, MYSTACHE, FREEMARKER
// SPA -> VUE -> vue + ssr = nuxt,js => 이걸로 할 예정
// REACT -> react + ssr => next.js
// -> javascript + <-> API (JSON)

// 데이터 기반으로 api 응답한다.
@RestController
public class PostController {

    @GetMapping("/posts")
    public String get() {
        return "Hello World";
    }
}
