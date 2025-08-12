package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Product;

/**
 * -> JpaRepo -> crud cơ bản và hỗ trợ phân trang, sắp xếp
 * -> Không cần viết sql
 * vd: Page<Product> findAll(Pageable page);
 * 
 * -> JpaSpecificationExecutor -> query linh hoạt thông qua Specification API
 * (lọc data nhiều "điều kiện động" )
 * vd: tìm tất cả laptop có giá trên 300 và có tên trùng với "acer"
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
    Page<Product> findAll(Pageable page);

    Page<Product> findAll(Specification<Product> spec, Pageable page);
}
