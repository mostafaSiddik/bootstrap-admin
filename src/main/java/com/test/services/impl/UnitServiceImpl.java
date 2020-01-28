package com.test.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.Unit;
import com.test.repositories.UnitRepository;
import com.test.services.UnitService;

@Component
public class UnitServiceImpl implements UnitService {

	@Autowired
	public UnitRepository unitRepository;

	@Override
	public Unit createUnit(Unit unit) {
		unit.setCreated_by(0000);
		unit.setCreated_date(getCurrentDate());
		unit.setIs_deleted(false);

		return unitRepository.save(unit);
	}

	@Override
	public Unit updateUnit(Integer id, Unit unit) {
		Unit unt = findUnit(id);

		unt.setName(unit.getName());
		unt.setShort_name(unit.getShort_name());
		unt.setDescription(unit.getDescription());
		unt.setModified_by(0000);
		unt.setModified_date(getCurrentDate());
		unt.setIs_deleted(false);

		return unitRepository.save(unt);
	}

	@Override
	public boolean deleteUnits(List<Integer> unitIds) {
		try {
			unitIds.stream().forEach(id -> {
				Unit unit = findUnit(id);

				unit.setModified_by(0000);
				unit.setModified_date(getCurrentDate());
				unit.setIs_deleted(true);

				unitRepository.save(unit);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public String getUnitName(Integer id) {
		return unitRepository.getUnitName(id);
	}

	@Override
	public List<String> getAllUnitName() {
		return unitRepository.getUnitNames();
	}

	@Override
	public Unit findUnit(Integer id) {
		Optional<Unit> unit = unitRepository.findById(id);
		return unit.isPresent() ? unit.get() : null;
	}

	@Override
	public List<Unit> findAllUnit() {
		return unitRepository.findAll().stream().filter(unit -> !unit.isIs_deleted())
				.collect(Collectors.toList());
	}

	private Date getCurrentDate() {
		return new Date();
	}
}
