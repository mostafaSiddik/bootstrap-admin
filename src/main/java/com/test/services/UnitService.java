package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.models.Unit;

@Service
public interface UnitService {

	public Unit createUnit(Unit unit);

	public Unit updateUnit(Integer id, Unit unit);

	public boolean deleteUnits(List<Integer> unitIds);

	public String getUnitName(Integer id);

	public List<String> getAllUnitName();

	public Unit findUnit(Integer id);

	public List<Unit> findAllUnit();

}
