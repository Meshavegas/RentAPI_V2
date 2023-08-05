package com.marcdev.rentAPI.Repository;

import com.marcdev.rentAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
