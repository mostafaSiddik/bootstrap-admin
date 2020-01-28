package com.test.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.Vendor;
import com.test.repositories.VendorRepository;
import com.test.services.VendorService;

@Component
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vendorRepository;

	@Override
	public Vendor createVendor(Vendor vendor) {
		vendor.setCreated_by(0000);
		vendor.setCreated_date(getCurrentDate());
		vendor.setIs_deleted(false);

		return vendorRepository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Integer id, Vendor vendor) {
		Vendor vend = findVendor(id);

		vend.setInstitute_id(vendor.getInstitute_id());
		vend.setCompany_id(vendor.getCompany_id());
		vend.setName(vendor.getName());
		vend.setCompany_name(vendor.getCompany_name());
		vend.setCode(vendor.getCode());
		vend.setCountry(vendor.getCountry());
		vend.setZipcode(vendor.getZipcode());
		vend.setEmail(vendor.getEmail());
		vend.setPhone(vendor.getPhone());
		vend.setMobile(vendor.getMobile());
		vend.setAddress(vendor.getAddress());

		vend.setModified_by(0000);
		vend.setModified_date(getCurrentDate());
		vend.setIs_deleted(false);

		return vendorRepository.save(vend);
	}

	@Override
	public boolean deleteVendors(List<Integer> vendorIds) {
		try {
			vendorIds.stream().forEach(id -> {
				Vendor vendor = findVendor(id);

				vendor.setModified_by(0000);
				vendor.setModified_date(getCurrentDate());
				vendor.setIs_deleted(true);

				vendorRepository.save(vendor);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public String getVendorName(Integer id) {
		return vendorRepository.getVendorName(id);
	}

	@Override
	public List<String> getAllVendorName() {
		return vendorRepository.getAllVendorName();
	}

	@Override
	public Vendor findVendor(Integer id) {
		Optional<Vendor> vendor = vendorRepository.findById(id);

		return vendor.isPresent() ? vendor.get() : null;
	}

	@Override
	public List<Vendor> findAllVendor() {
		return vendorRepository.findAll().stream().filter(vendor -> !vendor.isIs_deleted())
				.collect(Collectors.toList());
	}

	private Date getCurrentDate() {
		return new Date();
	}

}
