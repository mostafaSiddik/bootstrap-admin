package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.models.Size;

@Service
public interface SizeService {

	public Size createSize(Size size);

	public Size updateSize(Integer id, Size size);

	public boolean deleteSizes(List<Integer> sizeIds);

	public String getSizeName(Integer id);

	public List<String> getAllSizeName();

	public Size findSize(Integer id);

	public List<Size> findAllSize();

}
