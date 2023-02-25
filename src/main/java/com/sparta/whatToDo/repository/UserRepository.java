package com.sparta.whatToDo.repository;

import com.sparta.whatToDo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
