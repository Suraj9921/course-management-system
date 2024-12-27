package com.technest.learning_management_system.service;

import com.technest.learning_management_system.entity.User;

public interface UserService {

    User loadUserByEmail(String email);

    User createUser(String email, String password);

    void assignRoleToUser(String email, String roleName);
}
