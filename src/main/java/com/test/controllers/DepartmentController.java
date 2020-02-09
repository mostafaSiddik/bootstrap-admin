package com.test.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.models.Department;
import com.test.models.ProductType;
import com.test.services.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping
	public String newDepartment(ModelMap model) {
		Department department = new Department();
		model.addAttribute("view_mode", "Entry");
		model.addAttribute("department", department);
		return "department";
	}
	
	@PostMapping
	public String newDepartment(Department department, ModelMap map) {
		Map<String, String> response = new HashMap<String, String>();
		departmentService.createDepartment(department);
		response.put("status", "success");
		return "redirect:list";
	}
	
	@GetMapping("{id}")
	public String updateDepartment(@PathVariable Integer id, ModelMap model) {
		model.addAttribute("view_mode", "Update");
		model.addAttribute("id", id);
		model.addAttribute("department", departmentService.findDepartment(id));
		return "department";
	}
	
	@PostMapping("{id}")
	public String updateDepartment(@PathVariable Integer id,Department department, ModelMap model) {
		Map<String, String> response = new HashMap<String, String>();
		departmentService.updateDepartment(id, department);
		response.put("status", "success");
		return "redirect:list";
	}
	
	@PostMapping("/delete")
	@ResponseBody
	public Map<String, String> batchDeleteDepartment(@RequestParam(value = "itemIds[]") List<Integer> departmentIds) {
		System.out.println("delete");
		Map<String, String> response = new HashMap<String, String>();
		boolean status = departmentService.deleteDepartment(departmentIds);
		System.out.println(status);
		response.put("status", status ? "success" : "failed");
		return response;
	}
	
	@GetMapping("/list")
	public String departmentList(ModelMap map) {
		map.addAttribute("department_list", departmentService.findAllDepartment());
		return "department_list";
	}
}
