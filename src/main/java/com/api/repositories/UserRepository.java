package com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
