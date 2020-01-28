package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.models.Vendor;

@Service
public interface VendorService {

	public Vendor createVendor(Vendor vendor);

	public Vendor updateVendor(Integer id, Vendor vendor);

	public boolean deleteVendors(List<Integer> vendorIds);

	public String getVendorName(Integer id);

	public List<String> getAllVendorName();

	public Vendor findVendor(Integer id);

	public List<Vendor> findAllVendor();
}
