package com.ust.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.jwt.entity.UserCredential;

import java.util.Optional;

public interface UserCredentialRepository  extends JpaRepository<UserCredential,Integer> {
    Optional<UserCredential> findByName(String username);
}
