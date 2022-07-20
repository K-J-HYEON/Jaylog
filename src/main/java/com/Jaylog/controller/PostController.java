package com.Jaylog.controller;

import com.Jaylog.domain.Post;
import com.Jaylog.request.PostCreate;
import com.Jaylog.response.PostResponse;
import com.Jaylog.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/posts")
    public void post(@RequestBody @Valid PostCreate request) {
        postService.write(request);
    }

    // 조회 API
    // 여러개의 글을 조회 API
    // /posts

    @GetMapping("/posts/{postId}")
    public PostResponse get(@PathVariable Long postId) {
        return postService.get(postId);
    }

    @GetMapping("/posts")
    public List<Post> getList() {
        return postService.getList();
    }
}
