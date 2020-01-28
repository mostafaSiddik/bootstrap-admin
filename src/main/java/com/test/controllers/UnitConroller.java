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

import com.test.models.Unit;
import com.test.services.UnitService;

@Controller
@RequestMapping("/unit")
public class UnitConroller {

	@Autowired
	private UnitService unitService;

	@GetMapping
	public String newUnit(ModelMap model) {
		Unit unit = new Unit();
		model.addAttribute("view_mode", "New");
		model.addAttribute("unit", unit);
		return "unit";
	}

	@PostMapping
	public String newUnit(Unit unit, ModelMap map) {
		Map<String, String> response = new HashMap<String, String>();
		unitService.createUnit(unit);
		response.put("status", "success");
		return "redirect:list";
	}

	@GetMapping("{id}")
	public String updateUnit(@PathVariable Integer id, ModelMap model) {
		model.addAttribute("view_mode", "Update");
		model.addAttribute("id", id);
		model.addAttribute("unit", unitService.findUnit(id));
		return "unit";
	}

	@PostMapping("{id}")
	public String updateUnit(@PathVariable Integer id, Unit unit, ModelMap map) {
		Map<String, String> response = new HashMap<String, String>();
		unitService.updateUnit(id, unit);
		response.put("status", "success");
		return "redirect:list";
	}

	@PostMapping("/delete")
	@ResponseBody
	public Map<String, String> batchDeleteUnit(@RequestParam(value = "itemIds[]") List<Integer> unitIds) {
		Map<String, String> response = new HashMap<String, String>();
		boolean status = unitService.deleteUnits(unitIds);
		System.out.println(status);
		response.put("status", status ? "success" : "failed");
		return response;
	}

	@GetMapping("/list")
	public String unitList(ModelMap map) {
		map.addAttribute("unit_list", unitService.findAllUnit());
		return "units";
	}

}
