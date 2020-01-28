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

import com.test.models.Size;
import com.test.services.SizeService;

@Controller
@RequestMapping("/size")
public class SizeConroller {

	@Autowired
	private SizeService sizeService;

	@GetMapping
	public String newSize(ModelMap model) {
		Size size = new Size();
		model.addAttribute("view_mode", "New");
		model.addAttribute("size", size);
		return "size";
	}

	@PostMapping
	public String newSize(Size size, ModelMap map) {
		Map<String, String> response = new HashMap<String, String>();
		sizeService.createSize(size);
		response.put("status", "success");
		return "redirect:list";
	}

	@GetMapping("{id}")
	public String updateSize(@PathVariable Integer id, ModelMap model) {
		model.addAttribute("view_mode", "Update");
		model.addAttribute("id", id);
		model.addAttribute("size", sizeService.findSize(id));
		return "size";
	}

	@PostMapping("{id}")
	public String updateSize(@PathVariable Integer id, Size size, ModelMap map) {
		Map<String, String> response = new HashMap<String, String>();
		sizeService.updateSize(id, size);
		response.put("status", "success");
		return "redirect:list";
	}

	@PostMapping("/delete")
	@ResponseBody
	public Map<String, String> batchDeleteSize(@RequestParam(value = "itemIds[]") List<Integer> sizeIds) {
		Map<String, String> response = new HashMap<String, String>();
		boolean status = sizeService.deleteSizes(sizeIds);
		System.out.println(status);
		response.put("status", status ? "success" : "failed");
		return response;
	}

	@GetMapping("/list")
	public String sizeList(ModelMap map) {
		map.addAttribute("size_list", sizeService.findAllSize());
		return "sizes";
	}

}
