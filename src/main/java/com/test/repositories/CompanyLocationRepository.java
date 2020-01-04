package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.CompanyLocation;

@Repository
public interface CompanyLocationRepository extends JpaRepository<CompanyLocation, Integer> {

}
