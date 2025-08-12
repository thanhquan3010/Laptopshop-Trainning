package com.example.demo.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    // xem thong tin sản phẩm
    @GetMapping("/admin/product")
    public String getProduct() {
        return null;
    }

    @GetMapping("/admin/product/{id}")
    public String getProductDetailPage() {
        return null;
    }

    // thêm mới sản phẩm
    @GetMapping("/admin/product/create")
    public String getCreateProductPage() {
        return null;
    }

    @PostMapping("/admin/product/create")
    public String handleCreateProduct() {
        return null;
    }

    // cập nhật sản phẩm theo id
    @GetMapping("/admin/product/{id}")
    public String getUpdateProductPage() {
        return null;
    }

    @PostMapping("/admin/product")
    public String handleUpdateProduct() {
        return null;
    }

    // xóa sản phẩm theo id
    @GetMapping("/admin/product/delete/{id}")
    public String getDeleteProductPage() {
        return null;
    }

    @PostMapping("/admin/pproduct/delete")
    public String handleDeleteProduct() {
        return null;
    }
}
