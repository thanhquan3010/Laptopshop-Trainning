package com.example.demo.controller.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        return null;
    }

    // xem tất cả người dùng
    @RequestMapping("/admin/user")
    public String getUserPage() {
        return null;
    }

    // xem thông tin chi tiết từng người dùng
    @RequestMapping("/admin/user/{id}")
    public String getUserDetailPage() {
        return null;
    }

    // thêm thông tin người dùng
    @RequestMapping("/admin/user/create")
    public String getCreateUserPage() {
        return null;
    }

    @PostMapping("/admin/user/create")
    public String createUserPage() {
        return null;
    }

    // cập nhật thông tin người dùng
    @RequestMapping("/admin/user/update/{id}")
    public String getUpdateUserPage() {
        return null;
    }

    @PostMapping("/admin/user/update")
    public String postUpdateUserPage() {
        return null;
    }

    // xóa người dùng theo id
    @GetMapping("/admin/user/delete/{id}")
    public String getDeleteUserPage() {
        return null;
    }

    @PostMapping("/admin/user/delete")
    public String postDeleteUserPage() {
        return null;
    }

}
