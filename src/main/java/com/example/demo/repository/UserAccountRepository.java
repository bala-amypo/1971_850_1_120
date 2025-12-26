package com.example.demo.repository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserAccount;

import java.util.Optional;
@Repository
public interface UserAccountRepository {

    Optional<UserAccount> findByUsername(String username);

    UserAccount save(UserAccount user);
}
