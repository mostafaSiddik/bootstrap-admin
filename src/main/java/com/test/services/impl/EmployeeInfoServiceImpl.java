package com.test.services.impl;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.Category;
import com.test.models.EmployeeInfo;
import com.test.repositories.EmployeeInfoRepository;
import com.test.services.EmployeeInfoService;

@Component
public class EmployeeInfoServiceImpl implements EmployeeInfoService {
	@Autowired
	public EmployeeInfoRepository employeeInfoRepository;
	
	@Override
	public EmployeeInfo createEmployeeInfo(EmployeeInfo employeeInfo) {
		employeeInfo.setCreated_by(0000);
		employeeInfo.setCreated_date(getCurrentDate());
		employeeInfo.setIs_deleted(false);
		
		return employeeInfoRepository.save(employeeInfo);
	}

	@Override
	public List<EmployeeInfo> findAllEmployeeInfo() {
		return employeeInfoRepository.findAll().stream().filter(employeeInfo -> !employeeInfo.isIs_deleted())
				.sorted(Comparator.comparing(EmployeeInfo::getFirst_name)).collect(Collectors.toList());
	}
	
	private Date getCurrentDate() {
		
		return new Date();
	}
}
