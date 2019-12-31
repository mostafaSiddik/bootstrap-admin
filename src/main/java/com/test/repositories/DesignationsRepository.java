package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.models.Designations;

public interface DesignationsRepository extends JpaRepository<Designations, Integer> {

}
