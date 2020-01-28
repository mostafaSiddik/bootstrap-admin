package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.models.JobOrder;

@Service
public interface JobOrderService {

	public JobOrder createJobOrder(JobOrder jobOrder);

	public JobOrder updateJobOrder(Integer id, JobOrder jobOrder);

	public boolean deleteJobOrders(List<Integer> jobOrderIds);

	public String getJobOrderNumber(Integer id);

	public List<String> getAllJobOrderNumber();

	public JobOrder findJobOrder(Integer id);

	public List<JobOrder> findAllJobOrder();

}
