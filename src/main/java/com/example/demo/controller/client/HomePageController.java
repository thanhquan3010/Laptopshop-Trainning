package com.example.demo.controller.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class HomePageController {
    // giao dien trang home
    @GetMapping("/")
    public String getHomePage() {
        return null;
    }

    // dang ky
    @GetMapping("/register")
    public String getRegisterPage() {
        return null;
    }

    @PostMapping("/register")
    public String handleRegisterPage() {
        return null;
    }

    // dang nhap
    @GetMapping("/login")
    public String getLoginPage() {
        return null;
    }

    @GetMapping("/access-deny")
    public String getDenyPage() {
        return null;
    }

}
