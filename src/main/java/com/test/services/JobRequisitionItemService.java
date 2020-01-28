package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.models.JobRequisitionItem;

@Service
public interface JobRequisitionItemService {

	public JobRequisitionItem createJobRequisitionItem(JobRequisitionItem jobRequisitionItem);

	public JobRequisitionItem updateJobRequisitionItem(Integer id, JobRequisitionItem jobRequisitionItem);

	public boolean deleteJobRequisitionItems(List<Integer> jobRequisitionItemIds);

	public JobRequisitionItem findJobRequisitionItem(Integer id);

	public List<JobRequisitionItem> findAllJobRequisitionItemByJobRequisitionId(Integer jobRequisitionId);

	public List<JobRequisitionItem> findAllJobRequisitionItem();
}
