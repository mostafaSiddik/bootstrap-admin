package com.test.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.JobRequisition;
import com.test.repositories.JobRequisitionRepository;
import com.test.services.JobRequisitionService;

@Component
public class JobRequisitionServiceImpl implements JobRequisitionService {

	@Autowired
	private JobRequisitionRepository jobRequisitionRepository;

	@Override
	public JobRequisition createJobRequisition(JobRequisition jobRequisition) {
		jobRequisition.setCreated_by(0000);
		jobRequisition.setCreated_date(getCurrentDate());
		jobRequisition.setIs_deleted(false);

		return jobRequisitionRepository.save(jobRequisition);
	}

	@Override
	public JobRequisition updateJobRequisition(Integer id, JobRequisition jobRequisition) {
		JobRequisition jbReq = findJobRequisition(id);

		jbReq.setJob_order_id(jobRequisition.getJob_order_id());
		jbReq.setIssue_date(jobRequisition.getIssue_date());
		jbReq.setConfirm_date(jobRequisition.getConfirm_date());
		jbReq.setRequisition_by(jobRequisition.getRequisition_by());
		jbReq.setApproved_by(jobRequisition.getApproved_by());
		jbReq.setQuantity(jobRequisition.getQuantity());
		jbReq.setTotal_amount(jobRequisition.getTotal_amount());
		jbReq.setStatus(jobRequisition.getStatus());

		jbReq.setModified_by(0000);
		jbReq.setModified_date(getCurrentDate());
		jbReq.setIs_deleted(false);

		return jobRequisitionRepository.save(jbReq);
	}

	@Override
	public boolean deleteJobRequisitions(List<Integer> jobRequisitionIds) {
		try {
			jobRequisitionIds.stream().forEach(id -> {
				JobRequisition jobRequisition = findJobRequisition(id);

				jobRequisition.setModified_by(0000);
				jobRequisition.setModified_date(getCurrentDate());
				jobRequisition.setIs_deleted(true);

				jobRequisitionRepository.save(jobRequisition);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public JobRequisition findJobRequisition(Integer id) {
		Optional<JobRequisition> jobRequisition = jobRequisitionRepository.findById(id);

		return jobRequisition.isPresent() ? jobRequisition.get() : null;
	}

	@Override
	public List<JobRequisition> findAllJobRequisitionByJobOrderId(Integer jobOrderId) {
		return jobRequisitionRepository.getJobRequisitionsByJobOrderId(jobOrderId);
	}

	@Override
	public List<JobRequisition> findAllJobRequisition() {
		return jobRequisitionRepository.findAll().stream().filter(jobRequisition -> !jobRequisition.isIs_deleted())
				.collect(Collectors.toList());
	}

	private Date getCurrentDate() {
		return new Date();
	}
}
