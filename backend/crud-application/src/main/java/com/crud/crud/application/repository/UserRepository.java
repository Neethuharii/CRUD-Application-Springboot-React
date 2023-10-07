package com.crud.crud.application.repository;


import com.crud.crud.application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Long> {
}

