package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.LeaveApproval;

@Repository
public interface LeaveApprovalRepository extends JpaRepository<LeaveApproval, Integer> {

}
