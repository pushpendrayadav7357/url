package com.example.urladditional.service;

public class UserHitCount {
    private String username;
    private int hitcount;

    public String getUsername() {
        return username;
    }

    public int getHitcount() {
        return hitcount;
    }

    public UserHitCount(String username, int hitcount) {
        this.username = username;
        this.hitcount = hitcount;
    }
}
