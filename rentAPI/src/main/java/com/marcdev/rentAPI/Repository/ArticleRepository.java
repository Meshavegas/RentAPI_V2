package com.marcdev.rentAPI.Repository;

import com.marcdev.rentAPI.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
