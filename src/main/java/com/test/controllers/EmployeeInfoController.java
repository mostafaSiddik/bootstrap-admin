package com.test.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.models.Department;
import com.test.models.Designation;
import com.test.models.EmployeeInfo;
import com.test.services.DepartmentService;
import com.test.services.DesignationService;
import com.test.services.EmployeeInfoService;

@Controller
@RequestMapping("/employee_info")
public class EmployeeInfoController {
	@Autowired
	private EmployeeInfoService employeeInfoService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private DesignationService designationService;
	
	
	@GetMapping
	public String newEmployeeInfo(ModelMap model) {
		EmployeeInfo employeeInfo = new EmployeeInfo();
		model.addAttribute("view_mode","Entry");
		model.addAttribute("employeeInfo", employeeInfo);
		model.addAttribute("department_list",getAllDepartment());
		model.addAttribute("designation_list",getAllDesignation());
		return "employee_info";
	}
	
	@PostMapping
	public String newEmployeeInfo(EmployeeInfo employeeInfo, ModelMap model) {
		Map<String, String> response = new HashMap<String, String>();
		employeeInfoService.createEmployeeInfo(employeeInfo);
		response.put("stutus", "success");
		return "redirect:list";
	}

	@GetMapping("/list")
	public String employeeInfoList(ModelMap model) {
		List<Department> departments = getAllDepartment();
		List<Designation> designations = getAllDesignation();
		
		model.addAttribute("department_list", departments);
		model.addAttribute("designation_list", designations);
		model.addAttribute("department_names_map", departmentService.getNameMapWithIdFromDepartmentList(departments));
		model.addAttribute("designation_names_map", designationService.getNameMapWithIdFromDesignationList(designations));
		model.addAttribute("employee_info_list", employeeInfoService.findAllEmployeeInfo());
		return "categories";
	}

	private List<Designation> getAllDesignation() {
		return designationService.findAllDesignation();
		
	}


	private List<Department> getAllDepartment() {		
		return departmentService.findAllDepartment();
	}

}
