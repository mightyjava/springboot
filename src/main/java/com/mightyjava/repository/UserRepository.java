package com.mightyjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mightyjava.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
