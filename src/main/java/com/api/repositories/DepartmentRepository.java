package com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entities.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {

}
