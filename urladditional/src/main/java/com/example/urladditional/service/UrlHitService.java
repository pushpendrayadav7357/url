package com.example.urladditional.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {

    private int totalHitCount = 0;
    private Map<String, Integer> userHitCounts = new HashMap<>();

    public int incrementHitCount() {
        return ++totalHitCount;
    }

    public int getUserHitCount(String username) {
        return userHitCounts.getOrDefault(username, 0);
    }

    public void incrementUserHitCount(String username) {
        userHitCounts.put(username, userHitCounts.getOrDefault(username, 0) + 1);
    }
}