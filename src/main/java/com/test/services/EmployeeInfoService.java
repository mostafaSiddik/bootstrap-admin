package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.models.EmployeeInfo;

@Service
public interface EmployeeInfoService {


	public EmployeeInfo createEmployeeInfo(EmployeeInfo employeeInfo);

	public List<EmployeeInfo> findAllEmployeeInfo();

}
