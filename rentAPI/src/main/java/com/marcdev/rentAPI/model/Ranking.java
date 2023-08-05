package com.marcdev.rentAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rankings", schema = "rent")
public class Ranking {

    @EmbeddedId
    UserArticleKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @MapsId("articleId")
    @JoinColumn(name = "article_id")
    Article article;

    @Column
    private Long likes;

    @Column
    private Long dislike;
}

@Embeddable
@Data
class UserArticleKey implements Serializable{
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "article_id")
    private Long articleId;
}
