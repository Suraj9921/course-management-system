package com.technest.learning_management_system.dao;

import com.technest.learning_management_system.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
