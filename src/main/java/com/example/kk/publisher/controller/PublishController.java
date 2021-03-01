package com.example.kk.publisher.controller;

import com.example.kk.publisher.dto.Post;
import com.example.kk.publisher.service.PublishService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/publisher")
public class PublishController {
    
    @Autowired
    private PublishService service;

    @GetMapping("/publish")
    public String publish() {
        return "This is publisher";
    }

    @PostMapping("/publish")
    public Post publishPost(@RequestBody Post post) {
        service.publishMesssage(post.getMessage());
        return post;
    }
}
