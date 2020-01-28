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
import com.test.models.Vendor;
import com.test.services.VendorService;

@Controller
@RequestMapping("/" + VendorConroller.BASEURI)
public class VendorConroller {
	protected static final String BASEURI = "vendor";

	@Autowired
	private VendorService vendorService;

	@GetMapping
	public String newVendor(ModelMap model) {
		return vendorView(null, new Vendor(), model, TemplateViewMode.New);
	}

	@GetMapping("/{id}")
	public String updateVendor(@PathVariable Integer id, ModelMap model) {
		Vendor vendor = vendorService.findVendor(id);
		return vendorView(id, vendor, model, TemplateViewMode.Update);
	}

	private String vendorView(Integer id, Vendor vendor, ModelMap model, TemplateViewMode viewMode) {
		model.addAttribute("base_uri", BASEURI);
		model.addAttribute("view_mode", viewMode);
		//TODO: Have to add company, institute and buyers list as model attribute; 
		model.addAttribute("id", id);
		model.addAttribute("vendor", vendor);
		return "vendor";
	}

	@PostMapping
	public String newVendor(@Validated Vendor vendor, ModelMap model) {
		Map<String, String> response = new HashMap<String, String>();
		vendorService.createVendor(vendor);
		response.put("status", "success");
		return "redirect:list";
	}

	@PostMapping("/{id}")
	public String updateVendor(@PathVariable Integer id, @Validated Vendor vendor, ModelMap model) {
		Map<String, String> response = new HashMap<String, String>();
		vendorService.updateVendor(id, vendor);
		response.put("status", "success");
		return "redirect:list";
	}

	@PostMapping("/delete")
	@ResponseBody
	public Map<String, String> batchDeleteVendor(@RequestParam(value = "itemIds[]") List<Integer> vendorIds) {
		Map<String, String> response = new HashMap<String, String>();
		boolean status = vendorService.deleteVendors(vendorIds);
		System.out.println(status);
		response.put("status", status ? "success" : "failed");
		return response;
	}

	@GetMapping("/list")
	public String vendorList(ModelMap model) {
		model.addAttribute("base_uri", BASEURI);
		//TODO: Have to add attribute of buyers;
		model.addAttribute("vendor_list", vendorService.findAllVendor());
		return "vendors";
	}
}
