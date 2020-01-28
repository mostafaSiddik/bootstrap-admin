package com.test.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.Factory;
import com.test.repositories.FactoryRepository;
import com.test.services.FactoryService;

@Component
public class FactoryServiceImpl implements FactoryService {

	@Autowired
	private FactoryRepository factoryRepository;

	@Override
	public Factory createFactory(Factory factory) {
		factory.setCreated_by(0000);
		factory.setCreated_date(getCurrentDate());
		factory.setIs_deleted(false);

		return factoryRepository.save(factory);
	}

	@Override
	public Factory updateFactory(Integer id, Factory factory) {
		Factory fact = findFactory(id);

		fact.setInstitute_id(factory.getInstitute_id());
		fact.setCompany_id(factory.getCompany_id());
		fact.setBuyer_id(factory.getBuyer_id());
		fact.setName(factory.getName());
		fact.setCode(factory.getCode());
		fact.setCountry(factory.getCountry());
		fact.setZipcode(factory.getZipcode());
		fact.setEmail(factory.getEmail());
		fact.setPhone(factory.getPhone());
		fact.setMobile(factory.getMobile());
		fact.setAddress(factory.getAddress());

		fact.setModified_by(0000);
		fact.setModified_date(getCurrentDate());
		fact.setIs_deleted(false);

		return factoryRepository.save(fact);
	}

	@Override
	public boolean deleteFactories(List<Integer> factoryIds) {
		try {
			factoryIds.stream().forEach(id -> {
				Factory factory = findFactory(id);

				factory.setModified_by(0000);
				factory.setModified_date(getCurrentDate());
				factory.setIs_deleted(true);

				factoryRepository.save(factory);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public String getFactoryName(Integer id) {
		return factoryRepository.getFactoryName(id);
	}

	@Override
	public List<String> getAllFactoryName() {
		return factoryRepository.getAllFactoryName();
	}

	@Override
	public Factory findFactory(Integer id) {
		Optional<Factory> factory = factoryRepository.findById(id);

		return factory.isPresent() ? factory.get() : null;
	}

	@Override
	public List<Factory> findAllFactory() {
		return factoryRepository.findAll().stream().filter(factory -> !factory.isIs_deleted())
				.collect(Collectors.toList());
	}

	private Date getCurrentDate() {
		return new Date();
	}

}
