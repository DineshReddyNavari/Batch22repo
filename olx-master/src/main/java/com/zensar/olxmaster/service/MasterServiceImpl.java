package com.zensar.olxmaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.zensar.olxmaster.entity.Category;
import com.zensar.olxmaster.entity.Status;
import com.zensar.olxmaster.repository.CategoryRepository;
import com.zensar.olxmaster.repository.StatusRepository;

@Service

public class MasterServiceImpl implements MasterService{
	@Autowired
	public CategoryRepository categoryRepository;
	@Autowired
	public StatusRepository statusRepository;

	@Override
	public List<Category> getCategories() {
		
		return categoryRepository.findAll();
	}

	@Override
	public List<Status> getStatus() {
		
		return statusRepository.findAll();
	}

}
