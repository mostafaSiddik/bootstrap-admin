package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.SalaryIncrementSetting;

@Repository
public interface SalaryIncrementSettingRepository extends JpaRepository<SalaryIncrementSetting, Integer> {

}
