package com.sparta.whatToDo.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @Column(nullable = false)
    private String date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany
    private List<Like> likes = new ArrayList<>();

    @OneToMany
    private List<ToDo> todos = new ArrayList<>();

    @Column(nullable = false)
    private Boolean open;

    //생성 메서드
    @Builder
    public Post(String date, User user, Boolean open){
        this.date = date;
        this.user = user;
        this.open = open;
    }

}
