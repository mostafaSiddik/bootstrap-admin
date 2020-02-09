package com.test.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.test.models.Designation;

@Service
public interface DesignationService {

	public Designation createDesignation(Designation designation);

	public List<Designation> findAllDesignation();

	public Designation findDesignation(Integer id);

	public Designation updateDesignation(Integer id, Designation designation);

	public boolean deleteDesignation(List<Integer> designationIds);

	public Map<Integer, String> getNameMapWithIdFromDesignationList(List<Designation> designations);

}
