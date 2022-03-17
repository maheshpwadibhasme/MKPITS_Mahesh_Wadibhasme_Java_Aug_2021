package com.example.spring_boot_crud1.repository;

import com.example.spring_boot_crud1.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login,Long> {
}
