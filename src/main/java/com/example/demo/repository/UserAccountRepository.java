package com.example.demo.repository;

import com.example.demo.entity.UserAccount;

import java.util.Optional;

public interface UserAccountRepository {

    Optional<UserAccount> findByUsername(String username);

    UserAccount save(UserAccount user);
}
