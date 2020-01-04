package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.JobRequisitions;

@Repository
public interface JobRequisitionsRepository extends JpaRepository<JobRequisitions, Integer> {

}
