package com.example.walletWatch.repository;

import com.example.walletWatch.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
