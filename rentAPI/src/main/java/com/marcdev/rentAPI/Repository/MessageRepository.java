package com.marcdev.rentAPI.Repository;

import com.marcdev.rentAPI.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
