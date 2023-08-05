package com.marcdev.rentAPI.Repository;

import com.marcdev.rentAPI.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
