package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.models.JobOrderItem;

@Service
public interface JobOrderItemService {

	public JobOrderItem createJobOrderItem(JobOrderItem jobOrderItem);

	public JobOrderItem updateJobOrderItem(Integer id, JobOrderItem jobOrderItem);

	public boolean deleteJobOrderItems(List<Integer> jobOrderItemIds);

	public JobOrderItem findJobOrderItem(Integer id);

	public List<JobOrderItem> findAllJobOrderItemByJobOrderId(Integer jobOrderId);

	public List<JobOrderItem> findAllJobOrderItem();
}
