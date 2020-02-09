package com.test.services.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.Department;
import com.test.models.Designation;
import com.test.repositories.DesignationRepository;
import com.test.services.DesignationService;

@Component
public class DesignationsServiceImpl implements DesignationService {
	@Autowired
	DesignationRepository deignationRepository;
	
	public Designation createDesignation(Designation designation) {
		return deignationRepository.save(designation);
	}
	
	public List<Designation> findAllDesignation() {
		return deignationRepository.findAll();
	}
	
	public Designation findDesignation(Integer id) {
		Optional<Designation> designation = deignationRepository.findById(id);
		
		return designation.isPresent() ? designation.get() : null;
	}
	
	public Designation updateDesignation(Integer id, Designation designation) {
		Designation dsg = findDesignation(id);
		
		dsg.setTitle(designation.getTitle());
		dsg.setShort_title(designation.getShort_title());
		
		return deignationRepository.save(dsg);
	}
	
	public boolean deleteDesignation(List<Integer> desigantionIds) {
		try {
			desigantionIds.stream().forEach(id -> {
				Designation designation = findDesignation(id);

				deignationRepository.delete(designation);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	@Override
	public Map<Integer, String> getNameMapWithIdFromDesignationList(List<Designation> designations){
		return designations.stream().collect(Collectors.toMap(Designation::getId, Designation::getTitle));
	}
}
