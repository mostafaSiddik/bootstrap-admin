package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.models.Departments;

public interface DepartmentsRepository extends JpaRepository<Departments, Integer> {

}
