package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.PreviousJobHistory;

@Repository
public interface PreviousJobHistoryRepository extends JpaRepository<PreviousJobHistory, Integer> {

}
