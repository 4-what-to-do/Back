package com.sparta.whatToDo.repository;

import com.sparta.whatToDo.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
