package com.zensar.olxadvertise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxadvertise.dto.AdvertiseDto;
import com.zensar.olxadvertise.entity.Advertise;
import com.zensar.olxadvertise.exception.InvalidAdvertiseIdException;
import com.zensar.olxadvertise.service.OlxAdvertiseService;

@RestController
@ComponentScan
@Component
@RequestMapping("/advertise")
public class AdvertiseController {

	@Autowired
	public OlxAdvertiseService advertiseService;

	@GetMapping(value = "/advertise",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Advertise> getAllAdvertises() {

		return advertiseService.getAllAdvertises();
	}

	@GetMapping(value = "/advertise/{categoryId}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Advertise getAdvertise(@PathVariable long categoryId) throws InvalidAdvertiseIdException {

		return advertiseService.getAdvertise(categoryId);
	}

	@PostMapping("/advertise")
	public Advertise createAdvertise(Advertise advertise, @RequestHeader("anand") String token) {

		return advertiseService.createAdvertise(advertise, "anand123");

	}
	
	@GetMapping(value = "/user/advertise/",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Advertise> getAllAdvertise(@RequestHeader("anand") String token) {
		
		return advertiseService.getAllAdvertise("anand123");
	}
	
	@GetMapping(value = "/user/advertise/{categoryId}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Advertise getAdvertise(@PathVariable long categoryId,@RequestHeader("anand") String token) throws InvalidAdvertiseIdException {
		
		return advertiseService.getAdvertise(categoryId, "anand123");
	}
	
	@GetMapping(value = "/advertise/search/{filter}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<AdvertiseDto> filterBasedAdvertise(@PathVariable String filter){
		return advertiseService.filterBasedAdvertise(filter);
		
	}
	@GetMapping(value = "/advertise/search/{text}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<AdvertiseDto> findAdvertiseByStatusOrTitle(String text){
		return advertiseService.findAdvertiseByStatusOrTitle(text);
		
	}
	
	@PostMapping(value = "/advertise/{categoryId}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public AdvertiseDto updateAdvertiseDto(@PathVariable long categoryId,@RequestBody Advertise advertise) throws InvalidAdvertiseIdException {
		
		
		return advertiseService.updateAdvertise(categoryId, advertise);
		
	}
	

	

}
