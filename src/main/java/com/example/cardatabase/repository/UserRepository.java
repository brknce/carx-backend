package com.example.cardatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cardatabase.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
