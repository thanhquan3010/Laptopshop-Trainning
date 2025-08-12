package com.example.demo.controller.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class ItemController {

    // hien thi chi tiet san pham theo id
    // lay id tu url
    @GetMapping("/product/{id}")
    public String getProductPage() {
        return null;
    }

    // them san pham co id vao gio hang cua user
    @PostMapping("/add-product-to-cart/{id}")
    public String addProductToCart() {
        return null;
    }

    // lay thong tin gio hang cua user va hien ra man hinh
    @GetMapping("/cart")
    public String getCartPage() {
        return null;
    }

    // xoa 1 san pham trong gio hang
    @GetMapping("/delete-cart-product/{id}")
    public String deleteCartdetail() {
        return null;
    }

    // xem trang thanh toan ( trang checkout voi thong tin gio hang va tong tien)
    @GetMapping("/checkout")
    public String getCheckOutPage() {
        return null;
    }

    // xac nhan gio hang truoc khi thanh toan
    @PostMapping("/confirm-checkout")
    public String handleCheckOutPage() {
        return null;
    }

    // dat hang ( luu don hang vao db voi thong tin nguoi nhan)
    @GetMapping("/place-order")
    public String handlePlaceOrder() {
        return null;
    }

    // trang cam on ()
    @GetMapping("/thanks")
    public String getThankyouPage() {
        return null;
    }

    // danh sach san pham(lay san pham kem theo phan trang, loc theo tieu chi: name,
    // ...)
    @GetMapping("/products")
    public String handleCreateProduct() {
        return null;
    }

}
