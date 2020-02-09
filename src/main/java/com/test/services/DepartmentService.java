package com.test.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.test.models.Department;

@Service
public interface DepartmentService {

	public Department createDepartment(Department department);


	public List<Department> findAllDepartment();


	public Department findDepartment(Integer id);


	public Department updateDepartment(Integer id, Department department);


	public boolean deleteDepartment(List<Integer> departmentIds);
	

	public Map<Integer, String> getNameMapWithIdFromDepartmentList(List<Department> departments);
	
}
