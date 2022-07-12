package com.Jaylog.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

class PostControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("posts 요청시 Hello World를 출력한다.")
    void test() {
        // expected
    }
}