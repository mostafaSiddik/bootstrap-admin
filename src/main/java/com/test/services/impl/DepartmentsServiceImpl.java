package com.test.services.impl;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.Department;
import com.test.models.ProductType;
import com.test.repositories.DepartmentRepository;
import com.test.services.DepartmentService;

@Component
public class DepartmentsServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;


	public Department createDepartment(Department department) {
		
		department.setCreated_by(0000);
		department.setCreated_date(getCurrentDate());
		department.setIs_deleted(false);
	
		return departmentRepository.save(department);
	}
	
	private Date getCurrentDate() {
		// TODO Auto-generated method stub
		return new Date();
	}

	public List<Department> findAllDepartment() {
		return departmentRepository.findAll().stream().filter(department -> !department.isIs_deleted())
				.sorted(Comparator.comparing(Department::getName)).collect(Collectors.toList());
	}
	
	public Department findDepartment(Integer id) {
		Optional<Department> department = departmentRepository.findById(id);
		
		return department.isPresent() ? department.get() : null;
	}
	
	public Department updateDepartment(Integer id, Department department) {
		Department dpt = findDepartment(id);
		
		dpt.setName(department.getName());
		dpt.setPhone(department.getPhone());
		dpt.setMobile(department.getMobile());
		dpt.setEmail(department.getEmail());
		dpt.setCreated_by(0000);
		dpt.setCreated_date(getCurrentDate());
		dpt.setIs_deleted(false);
		
		return departmentRepository.save(dpt);
	}
	
	public boolean deleteDepartment(List<Integer> departmentIds) {
		try {
			departmentIds.stream().forEach(id -> {
				Department department = findDepartment(id);

				department.setModified_by(0000);
				department.setModified_date(getCurrentDate());
				department.setIs_deleted(true);

				departmentRepository.save(department);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	@Override
	public Map<Integer, String> getNameMapWithIdFromDepartmentList(List<Department> departments){
		return departments.stream().collect(Collectors.toMap(Department::getId, Department::getName));
	}
}
