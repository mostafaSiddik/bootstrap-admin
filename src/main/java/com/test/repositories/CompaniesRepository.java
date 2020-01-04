package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Companies;

@Repository
public interface CompaniesRepository extends JpaRepository<Companies, Integer> {

}
