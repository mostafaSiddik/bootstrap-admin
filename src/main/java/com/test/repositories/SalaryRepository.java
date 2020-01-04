package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer> {

}
