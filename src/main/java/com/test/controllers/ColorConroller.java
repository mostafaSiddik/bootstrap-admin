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

import com.test.models.Color;
import com.test.services.ColorService;

@Controller
@RequestMapping("/color")
public class ColorConroller {

	@Autowired
	private ColorService colorService;

	@GetMapping
	public String newColor(ModelMap model) {
		Color color = new Color();
		model.addAttribute("view_mode", "New");
		model.addAttribute("color", color);
		return "color";
	}

	@PostMapping
	public String newColor(Color color, ModelMap map) {
		Map<String, String> response = new HashMap<String, String>();
		colorService.createColor(color);
		response.put("status", "success");
		return "redirect:list";
	}

	@GetMapping("{id}")
	public String updateColor(@PathVariable Integer id, ModelMap model) {
		model.addAttribute("view_mode", "Update");
		model.addAttribute("id", id);
		model.addAttribute("color", colorService.findColor(id));
		return "color";
	}

	@PostMapping("{id}")
	public String updateColor(@PathVariable Integer id, Color color, ModelMap map) {
		Map<String, String> response = new HashMap<String, String>();
		colorService.updateColor(id, color);
		response.put("status", "success");
		return "redirect:list";
	}

	@PostMapping("/delete")
	@ResponseBody
	public Map<String, String> batchDeleteColor(@RequestParam(value = "itemIds[]") List<Integer> colorIds) {
		Map<String, String> response = new HashMap<String, String>();
		boolean status = colorService.deleteColors(colorIds);
		System.out.println(status);
		response.put("status", status ? "success" : "failed");
		return response;
	}

	@GetMapping("/list")
	public String colorList(ModelMap map) {
		map.addAttribute("color_list", colorService.findAllColor());
		return "colors";
	}

}
