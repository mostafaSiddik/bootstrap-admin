package com.test.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.JobOrderItem;
import com.test.repositories.JobOrderItemRepository;
import com.test.services.JobOrderItemService;

@Component
public class JobOrderItemServiceImpl implements JobOrderItemService {

	@Autowired
	private JobOrderItemRepository jobOrderItemRepository;

	@Override
	public JobOrderItem createJobOrderItem(JobOrderItem jobOrderItem) {
		return jobOrderItemRepository.save(jobOrderItem);
	}

	@Override
	public JobOrderItem updateJobOrderItem(Integer id, JobOrderItem jobOrderItem) {
		JobOrderItem jbOrderItem = findJobOrderItem(id);

		jbOrderItem.setJob_order_id(jobOrderItem.getJob_order_id());
		jbOrderItem.setCategory_id(jobOrderItem.getCategory_id());
		jbOrderItem.setProduct_id(jobOrderItem.getProduct_id());
		jbOrderItem.setSize_id(jobOrderItem.getSize_id());
		jbOrderItem.setColor_id(jobOrderItem.getColor_id());
		jbOrderItem.setStyle(jobOrderItem.getStyle());
		jbOrderItem.setQuantity(jobOrderItem.getQuantity());
		jbOrderItem.setUnit_price(jobOrderItem.getUnit_price());
		jbOrderItem.setTotal_price(jobOrderItem.getTotal_price());

		return jobOrderItemRepository.save(jbOrderItem);
	}

	@Override
	public boolean deleteJobOrderItems(List<Integer> jobOrderItemIds) {
		try {
			jobOrderItemIds.stream().forEach(id -> {
				jobOrderItemRepository.deleteById(id);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public JobOrderItem findJobOrderItem(Integer id) {
		Optional<JobOrderItem> jobOrderItem = jobOrderItemRepository.findById(id);

		return jobOrderItem.isPresent() ? jobOrderItem.get() : null;
	}

	@Override
	public List<JobOrderItem> findAllJobOrderItemByJobOrderId(Integer jobOrderId) {
		return jobOrderItemRepository.getJobOrderItemsByJobOrderId(jobOrderId).stream()
				.collect(Collectors.toList());
	}

	@Override
	public List<JobOrderItem> findAllJobOrderItem() {
		return jobOrderItemRepository.findAll().stream().collect(Collectors.toList());
	}
}
