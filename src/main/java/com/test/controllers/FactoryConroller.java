package com.test.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.helper.Helper.TemplateViewMode;
import com.test.models.Factory;
import com.test.services.FactoryService;

@Controller
@RequestMapping("/" + FactoryConroller.BASEURI)
public class FactoryConroller {
	protected static final String BASEURI = "factory";

	@Autowired
	private FactoryService factoryService;

	@GetMapping
	public String newFactory(ModelMap model) {
		return factoryView(null, new Factory(), model, TemplateViewMode.New);
	}

	@GetMapping("/{id}")
	public String updateFactory(@PathVariable Integer id, ModelMap model) {
		Factory factory = factoryService.findFactory(id);
		return factoryView(id, factory, model, TemplateViewMode.Update);
	}

	private String factoryView(Integer id, Factory factory, ModelMap model, TemplateViewMode viewMode) {
		model.addAttribute("base_uri", BASEURI);
		model.addAttribute("view_mode", viewMode);
		//TODO: Have to add company, institute and buyers list as model attribute; 
		model.addAttribute("id", id);
		model.addAttribute("factory", factory);
		return "factory";
	}

	@PostMapping
	public String newFactory(@Validated Factory factory, ModelMap model) {
		Map<String, String> response = new HashMap<String, String>();
		factoryService.createFactory(factory);
		response.put("status", "success");
		return "redirect:list";
	}

	@PostMapping("/{id}")
	public String updateFactory(@PathVariable Integer id, @Validated Factory factory, ModelMap model) {
		Map<String, String> response = new HashMap<String, String>();
		factoryService.updateFactory(id, factory);
		response.put("status", "success");
		return "redirect:list";
	}

	@PostMapping("/delete")
	@ResponseBody
	public Map<String, String> batchDeleteFactory(@RequestParam(value = "itemIds[]") List<Integer> factoryIds) {
		Map<String, String> response = new HashMap<String, String>();
		boolean status = factoryService.deleteFactories(factoryIds);
		System.out.println(status);
		response.put("status", status ? "success" : "failed");
		return response;
	}

	@GetMapping("/list")
	public String factoryList(ModelMap model) {
		model.addAttribute("base_uri", BASEURI);
		//TODO: Have to add attribute of buyers;
		model.addAttribute("factory_list", factoryService.findAllFactory());
		return "factories";
	}
}
