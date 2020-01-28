package com.test.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.JobRequisitionItem;
import com.test.repositories.JobRequisitionItemRepository;
import com.test.services.JobRequisitionItemService;

@Component
public class JobRequisitionItemServiceImpl implements JobRequisitionItemService {

	@Autowired
	private JobRequisitionItemRepository jobRequisitionItemRepository;

	@Override
	public JobRequisitionItem createJobRequisitionItem(JobRequisitionItem jobRequisitionItem) {
		return jobRequisitionItemRepository.save(jobRequisitionItem);
	}

	@Override
	public JobRequisitionItem updateJobRequisitionItem(Integer id, JobRequisitionItem jobRequisitionItem) {
		JobRequisitionItem jbOrderItem = findJobRequisitionItem(id);

		jbOrderItem.setJob_requisition_id(jobRequisitionItem.getJob_requisition_id());
		jbOrderItem.setCategory_id(jobRequisitionItem.getCategory_id());
		jbOrderItem.setProduct_id(jobRequisitionItem.getProduct_id());
		jbOrderItem.setSize_id(jobRequisitionItem.getSize_id());
		jbOrderItem.setColor_id(jobRequisitionItem.getColor_id());
		jbOrderItem.setStyle(jobRequisitionItem.getStyle());
		jbOrderItem.setQuantity(jobRequisitionItem.getQuantity());
		jbOrderItem.setUnit_price(jobRequisitionItem.getUnit_price());
		jbOrderItem.setTotal_price(jobRequisitionItem.getTotal_price());

		return jobRequisitionItemRepository.save(jbOrderItem);
	}

	@Override
	public boolean deleteJobRequisitionItems(List<Integer> jobRequisitionItemIds) {
		try {
			jobRequisitionItemIds.stream().forEach(id -> {
				jobRequisitionItemRepository.deleteById(id);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public JobRequisitionItem findJobRequisitionItem(Integer id) {
		Optional<JobRequisitionItem> jobRequisitionItem = jobRequisitionItemRepository.findById(id);

		return jobRequisitionItem.isPresent() ? jobRequisitionItem.get() : null;
	}

	@Override
	public List<JobRequisitionItem> findAllJobRequisitionItemByJobRequisitionId(Integer jobRequisitionId) {
		return jobRequisitionItemRepository.getJobRequisitionItemsByJobRequisitionId(jobRequisitionId).stream()
				.collect(Collectors.toList());
	}

	@Override
	public List<JobRequisitionItem> findAllJobRequisitionItem() {
		return jobRequisitionItemRepository.findAll().stream().collect(Collectors.toList());
	}
}
