package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Cart;
import com.example.demo.domain.User;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUser(User user);

    // thao tác delete: cần phải lấy Cart lên từ db sau đó mới xóa
    // -> chậm hơn nên dùng native sql -> xóa luôn
    @Modifying
    @Query(value = "DELETE FROM carts WHERE id = :cartId", nativeQuery = true)
    void deleteCartDetailsByCartId(@Param("cartId") Long cartId);
}
