package com.example.urladditional.controller;
//import com.example.demo.service.UrlHitService;
import com.example.urladditional.service.UrlHitService;
import com.example.urladditional.service.UserHitCount;
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

    @GetMapping("/username/{username}/count")
    public UserHitCount getUserHitCount(@PathVariable String username) {
        int hitCount = urlHitService.getUserHitCount(username);
        return new UserHitCount(username,hitCount);
    }
}
