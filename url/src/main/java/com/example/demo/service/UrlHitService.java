package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UrlHitService {

    private int hitCount = 0;

    public int incrementHitCount() {
        return ++hitCount;
    }
}
