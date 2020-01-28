package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.models.Color;

@Service
public interface ColorService {

	public Color createColor(Color color);

	public Color updateColor(Integer id, Color color);

	public boolean deleteColors(List<Integer> colorIds);

	public String getColorName(Integer id);

	public List<String> getAllColorName();

	public Color findColor(Integer id);

	public List<Color> findAllColor();

}
