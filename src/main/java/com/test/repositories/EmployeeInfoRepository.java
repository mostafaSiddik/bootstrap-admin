package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.EmployeeInfo;

@Repository
public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo, Integer> {

}
