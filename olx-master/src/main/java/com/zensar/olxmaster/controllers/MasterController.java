package com.zensar.olxmaster.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxmaster.entity.Category;
import com.zensar.olxmaster.entity.Status;
import com.zensar.olxmaster.service.MasterService;

@RestController
@RequestMapping("/advertise")

public class MasterController {
	@Autowired
	public MasterService masterService;

	static List<Category> category = new ArrayList<Category>();
	static List<Status> status = new ArrayList<Status>();
	static {
		category.add(new Category(1, "Furniture"));
		category.add(new Category(2, "RealEstate"));
		category.add(new Category(3, "Cars"));
		category.add(new Category(4, "Mobiles"));
		category.add(new Category(5, "Sports"));

	}
	static {
		status.add(new Status(1, "Open"));
		status.add(new Status(2, "open"));
		status.add(new Status(3, "closed"));
		status.add(new Status(4, "closed"));
		status.add(new Status(5, "open"));
	}

	@GetMapping(value = "/advertise/category",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Category> getAllCategory() {
		return masterService.getCategories();
	}

	@GetMapping(value = "/advertise/status",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Status> getAllStatus() {
		return masterService.getStatus();
	}

}
