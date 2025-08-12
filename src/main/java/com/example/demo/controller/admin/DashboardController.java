package com.example.demo.controller.admin;

import org.springframework.web.bind.annotation.GetMapping;

public class DashboardController {
    @GetMapping("/admin")
    public String getDashBoard() {
        return null;
    }
}
