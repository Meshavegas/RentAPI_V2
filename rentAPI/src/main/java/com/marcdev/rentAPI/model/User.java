package com.marcdev.rentAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users", schema = "rent")
public class User {

    @OneToMany(mappedBy = "user", targetEntity = Article.class)//article relationShip
    Set<Article> article;

    @OneToMany(mappedBy = "user", targetEntity = Subscribe.class) //subscribes
    Set<Subscribe> subscribe;

    @OneToMany(mappedBy = "user", targetEntity = Comment.class)
    Set<Comment> comment;

    @OneToMany(mappedBy = "user")  // manyToMany
    Set<Ranking> ranking;

    @OneToMany(mappedBy = "user", targetEntity = Message.class)
    Set<Message> messages;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String username;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String surname;
    @Column(nullable = false, columnDefinition = "TEXT", unique = true)
    private String email;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String passWord;
    @Column
    private String sex;
    @Column( nullable = false, unique = true)
    private int phoneNumber;
    @Column
    private String country, columnDefinition = "TEXT";
    @Column()
    private Role role;


}
