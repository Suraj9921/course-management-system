package com.technest.learning_management_system.dao;

import com.technest.learning_management_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
