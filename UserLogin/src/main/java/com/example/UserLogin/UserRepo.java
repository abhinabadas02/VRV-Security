package com.example.UserLogin;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<OurUsers,Integer> {
    Optional<OurUsers> findByEmail(String email);
    Optional<OurUsers> findOneByIdAndPassword(Integer id, String password);
}
