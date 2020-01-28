package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.models.Factory;

@Service
public interface FactoryService {

	public Factory createFactory(Factory factory);

	public Factory updateFactory(Integer id, Factory factory);

	public boolean deleteFactories(List<Integer> factoryIds);

	public String getFactoryName(Integer id);

	public List<String> getAllFactoryName();

	public Factory findFactory(Integer id);

	public List<Factory> findAllFactory();
}
