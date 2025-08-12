package com.example.demo.controller.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class OderController {
    // xem giao dien gio hang
    @GetMapping("/admin/order")
    public String getDashboard() {
        return null;
    }

    @GetMapping("/admin/order/{id}")
    public String getViewOrderPage() {
        return null;
    }

    // cap nhat thong tin gio hang
    @GetMapping("/admin/order/update/{id}")
    public String getUpdateOrderPage() {
        return null;
    }

    @PostMapping("/admin/order/update")
    public String handleUpdateOrderPage() {
        return null;
    }

    // xoa san pham trong gio hang
    @GetMapping("admin/order/delete/{id}")
    public String getDeleteOrderPage() {
        return null;
    }

    @PostMapping("/admin/order/delete")
    public String handleDeleteOrderPage() {
        return null;
    }
}
