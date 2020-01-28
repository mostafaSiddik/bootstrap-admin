package com.test.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.JobOrder;
import com.test.repositories.JobOrderRepository;
import com.test.services.JobOrderService;

@Component
public class JobOrderServiceImpl implements JobOrderService {

	@Autowired
	private JobOrderRepository jobOrderRepository;

	@Override
	public JobOrder createJobOrder(JobOrder jobOrder) {
		jobOrder.setCreated_by(0000);
		jobOrder.setCreated_date(getCurrentDate());
		jobOrder.setIs_deleted(false);

		return jobOrderRepository.save(jobOrder);
	}

	@Override
	public JobOrder updateJobOrder(Integer id, JobOrder jobOrder) {
		JobOrder jbOrder = findJobOrder(id);

		jbOrder.setSample_order_id(jobOrder.getSample_order_id());
		jbOrder.setInstitute_id(jobOrder.getInstitute_id());
		jbOrder.setCompany_id(jobOrder.getCompany_id());
		jbOrder.setBuyer_id(jobOrder.getBuyer_id());
		jbOrder.setOrder_no(jobOrder.getOrder_no());
		jbOrder.setFactory_id(jobOrder.getFactory_id());
		jbOrder.setPo_no(jobOrder.getPo_no());
		jbOrder.setIssue_date(jobOrder.getIssue_date());
		jbOrder.setOrder_date(jobOrder.getOrder_date());
		jbOrder.setDelivery_date(jobOrder.getDelivery_date());
		jbOrder.setReference(jobOrder.getReference());
		jbOrder.setTerms(jobOrder.getTerms());
		jbOrder.setMerchandiser(jobOrder.getMerchandiser());
		jbOrder.setReceive_person_id(jobOrder.getReceive_person_id());
		jbOrder.setQuantity(jobOrder.getQuantity());
		jbOrder.setTotal_amount(jobOrder.getTotal_amount());
		jbOrder.setSample_design(jobOrder.getSample_design());
		jbOrder.setOrder_status(jobOrder.getOrder_status());
		jbOrder.setStock_status(jobOrder.getStock_status());
		jbOrder.setDelivery_status(jobOrder.getDelivery_status());
		jbOrder.setProduction_status(jobOrder.getProduction_status());

		jbOrder.setModified_by(0000);
		jbOrder.setModified_date(getCurrentDate());
		jbOrder.setIs_deleted(false);

		return jobOrderRepository.save(jbOrder);
	}

	@Override
	public boolean deleteJobOrders(List<Integer> jobOrderIds) {
		try {
			jobOrderIds.stream().forEach(id -> {
				JobOrder jobOrder = findJobOrder(id);

				jobOrder.setModified_by(0000);
				jobOrder.setModified_date(getCurrentDate());
				jobOrder.setIs_deleted(true);

				jobOrderRepository.save(jobOrder);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public String getJobOrderNumber(Integer id) {
		return jobOrderRepository.getJobOrderNumber(id);
	}

	@Override
	public List<String> getAllJobOrderNumber() {
		return jobOrderRepository.getAllJobOrderNumber();
	}

	@Override
	public JobOrder findJobOrder(Integer id) {
		Optional<JobOrder> jobOrder = jobOrderRepository.findById(id);

		return jobOrder.isPresent() ? jobOrder.get() : null;
	}

	@Override
	public List<JobOrder> findAllJobOrder() {
		return jobOrderRepository.findAll().stream().filter(jobOrder -> !jobOrder.isIs_deleted())
				.collect(Collectors.toList());
	}

	private Date getCurrentDate() {
		return new Date();
	}

}
