package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.models.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {

}
