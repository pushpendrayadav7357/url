package com.example.demo.controller;

import com.example.demo.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    private UrlHitService urlHitService;

    @GetMapping("/count")
    public int getHitCount() {
        return urlHitService.incrementHitCount();
    }
}
