package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Designations;

@Repository
public interface DesignationsRepository extends JpaRepository<Designations, Integer> {

}
