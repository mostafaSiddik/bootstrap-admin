package com.test.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.Size;
import com.test.repositories.SizeRepository;
import com.test.services.SizeService;

@Component
public class SizeServiceImpl implements SizeService {

	@Autowired
	public SizeRepository sizeRepository;

	@Override
	public Size createSize(Size size) {
		size.setCreated_by(0000);
		size.setCreated_date(getCurrentDate());
		size.setIs_deleted(false);

		return sizeRepository.save(size);
	}

	@Override
	public Size updateSize(Integer id, Size size) {
		Size sz = findSize(id);

		sz.setName(size.getName());
		sz.setShort_name(size.getShort_name());
		sz.setDescription(size.getDescription());
		sz.setModified_by(0000);
		sz.setModified_date(getCurrentDate());
		sz.setIs_deleted(false);

		return sizeRepository.save(sz);
	}

	@Override
	public boolean deleteSizes(List<Integer> sizeIds) {
		try {
			sizeIds.stream().forEach(id -> {
				Size size = findSize(id);

				size.setModified_by(0000);
				size.setModified_date(getCurrentDate());
				size.setIs_deleted(true);

				sizeRepository.save(size);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public String getSizeName(Integer id) {
		return sizeRepository.getSizeName(id);
	}

	@Override
	public List<String> getAllSizeName() {
		return sizeRepository.getSizeNames();
	}

	@Override
	public Size findSize(Integer id) {
		Optional<Size> size = sizeRepository.findById(id);
		return size.isPresent() ? size.get() : null;
	}

	@Override
	public List<Size> findAllSize() {
		return sizeRepository.findAll().stream().filter(size -> !size.isIs_deleted())
				.collect(Collectors.toList());
	}

	private Date getCurrentDate() {
		return new Date();
	}
}
