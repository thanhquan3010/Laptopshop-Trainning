package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Role;
import com.example.demo.domain.User;
import com.example.demo.domain.dto.RegisterDTO;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private ProductRepository productRepository;
    private OrderRepository orderRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository,
            ProductRepository productRepository, OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public String handleHello() {
        return "Hello from service";
    }

    // lấy ra danh sách người dùng
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    // lấy tất cả người dùng bằng tên email
    public List<User> getAllUserByEmail(String email) {
        return this.userRepository.findAllUserByEmail(email);
    }

    // kiểm tra email có tồn tại chưa
    public boolean checkEmailExists(String email) {
        return this.userRepository.existsByEmail(email);
    }

    // lấy 1 người dùng theo email
    public User getUserByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    // luu 1 user vao trong db
    public User handleSaveUser(User user) {
        return this.userRepository.save(user);
    }

    // lấy người dùng bởi id
    public User getUserById(long id) {
        return this.userRepository.findById(id);
    }

    // xóa 1 người dùng theo id
    public void deleteUserById(long id) {
        this.userRepository.deleteById(id);
    }

    // lấy thông tin role người đó theo tên đã định
    public Role getRoleByName(String name) {
        return this.roleRepository.findByName(name);
    }

    // chuyển RegisterDTO THÀNH User
    public User registerToDTO(RegisterDTO registerDTO) {
        User user = new User();
        user.setFullName(registerDTO.getFirstName() + " " + registerDTO.getLastName());
        user.setEmail(registerDTO.getEmail());
        user.setPassWord(registerDTO.getPassword());
        return user;
    }

    // đếm số lượng người dùng
    public long countUsers() {
        return this.userRepository.count();
    }

    // đếm số lượng sản phẩm trong db
    public long countProducts() {
        return this.productRepository.count();
    }

    // tổng số đơn hàng trong giỏ
    public long countOrders() {
        return this.orderRepository.count();
    }

}