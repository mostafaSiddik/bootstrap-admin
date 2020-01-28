package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.models.JobRequisition;

@Service
public interface JobRequisitionService {

	public JobRequisition createJobRequisition(JobRequisition jobRequisition);

	public JobRequisition updateJobRequisition(Integer id, JobRequisition jobRequisition);

	public boolean deleteJobRequisitions(List<Integer> jobRequisitionIds);

	public JobRequisition findJobRequisition(Integer id);

	public List<JobRequisition> findAllJobRequisitionByJobOrderId(Integer jobOrderId);

	public List<JobRequisition> findAllJobRequisition();
}
