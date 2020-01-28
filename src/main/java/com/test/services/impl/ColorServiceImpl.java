package com.test.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.Color;
import com.test.repositories.ColorRepository;
import com.test.services.ColorService;

@Component
public class ColorServiceImpl implements ColorService {

	@Autowired
	public ColorRepository colorRepository;

	@Override
	public Color createColor(Color color) {
		color.setCreated_by(0000);
		color.setCreated_date(getCurrentDate());
		color.setIs_deleted(false);

		return colorRepository.save(color);
	}

	@Override
	public Color updateColor(Integer id, Color color) {
		Color clr = findColor(id);

		clr.setName(color.getName());
		clr.setShort_name(color.getShort_name());
		clr.setDescription(color.getDescription());
		clr.setModified_by(0000);
		clr.setModified_date(getCurrentDate());
		clr.setIs_deleted(false);

		return colorRepository.save(clr);
	}

	@Override
	public boolean deleteColors(List<Integer> colorIds) {
		try {
			colorIds.stream().forEach(id -> {
				Color color = findColor(id);

				color.setModified_by(0000);
				color.setModified_date(getCurrentDate());
				color.setIs_deleted(true);

				colorRepository.save(color);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public String getColorName(Integer id) {
		return colorRepository.getColorName(id);
	}

	@Override
	public List<String> getAllColorName() {
		return colorRepository.getColorNames();
	}

	@Override
	public Color findColor(Integer id) {
		Optional<Color> color = colorRepository.findById(id);
		return color.isPresent() ? color.get() : null;
	}

	@Override
	public List<Color> findAllColor() {
		return colorRepository.findAll().stream().filter(color -> !color.isIs_deleted())
				.collect(Collectors.toList());
	}

	private Date getCurrentDate() {
		return new Date();
	}
}
