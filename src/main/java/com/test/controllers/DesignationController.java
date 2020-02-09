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

import com.test.models.Designation;
import com.test.services.DesignationService;

@Controller
@RequestMapping("/designation")
public class DesignationController {
	
	@Autowired
	private DesignationService designationService;
	
	@GetMapping
	public String newDesignation(ModelMap model) {
		Designation designation = new Designation();
		model.addAttribute("view_mode", "Entry");
		model.addAttribute("designation", designation);
		return "designation";
	}
	
	@PostMapping
	public String newDesignation(Designation designation, ModelMap model) {
		Map<String, String> response = new HashMap<String, String>();
		designationService.createDesignation(designation);
		response.put("status", "success");
		return "redirect:list";
	}
	
	@GetMapping("/list")
	public String designationList(ModelMap model) {
		model.addAttribute("designation_list", designationService.findAllDesignation());
		return "designation_list";
	}
	
	@GetMapping("{id}")
	public String updateDesignation(@PathVariable Integer id, ModelMap model) {
		model.addAttribute("view_mode", "Update");
		model.addAttribute("id", id);
		model.addAttribute("designation", designationService.findDesignation(id));
		return "designation";
	}
	
	@PostMapping("{id}")
	public String updateDesignation(@PathVariable Integer id, Designation designation, ModelMap model) {
		Map<String, String> response = new HashMap<String, String>();
		designationService.updateDesignation(id, designation);
		response.put("status", "success");
		return "redirect:list";
	}
	
	@PostMapping("/delete")
	@ResponseBody
	public Map<String, String> batchDeleteDeDesignation(@RequestParam(value = "itemIds[]") List<Integer> designationIds) {
		System.out.println("delete");
		Map<String, String> response = new HashMap<String, String>();
		boolean status = designationService.deleteDesignation(designationIds);
		System.out.println(status);
		response.put("status", status ? "success" : "failed");
		return response;
	}

}
