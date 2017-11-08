package com.yqueue.scube.service;

public interface AutoLoginService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
