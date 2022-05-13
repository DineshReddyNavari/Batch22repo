package com.zensar.olxadvertise.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.zensar.olxadvertise.dto.AdvertiseDto;
import com.zensar.olxadvertise.entity.Advertise;
import com.zensar.olxadvertise.exception.InvalidAdvertiseIdException;
@Service
@Component
public class OlxAdvertiseServiceImpl implements OlxAdvertiseService {
	@Autowired
	 public com.zensar.olxadvertise.repository.OlxAdvertiseRepository advertiseRepository;

	@Autowired 
	ModelMapper modelMapper;
	@Override
	public List<Advertise> getAllAdvertises() {
		
		return advertiseRepository.findAll();
	}

	@Override
	public Advertise createAdvertise(Advertise advertise, String token) {
		
		return advertiseRepository.save(advertise);
	}

	@Override
	public Advertise getAdvertise(long categoryId) throws InvalidAdvertiseIdException{
		
		Advertise byId = advertiseRepository.getById(categoryId);
		return getAdvertise(categoryId);
	}

	@Override
	public AdvertiseDto updateAdvertise(long categoryId, Advertise advertise) throws InvalidAdvertiseIdException{
		AdvertiseDto advertisedto = new AdvertiseDto();
		Advertise advertise1 = new Advertise();
		if(advertise1!=null) {
			advertise1.getCategoryId();
			advertise1.getTitle();
			advertise1.getCreateddate();
			advertise1.getDescription();
			advertise1.getPrice();
			advertise1.getStatus();
			advertise1.getUsername();
			return modelMapper.map(advertise,AdvertiseDto.class);
		}
		return advertisedto;
		
		
	}

	@Override
	public List<Advertise> getAllAdvertise(String token) {
		// TODO Auto-generated method stub
		return advertiseRepository.findAll();
	}

	@Override
	public Advertise getAdvertise(long categoryId, String token) throws InvalidAdvertiseIdException {
		// TODO Auto-generated method stub
		return advertiseRepository.findById(categoryId).get();
	}

	@Override
	public boolean deleteAdvertise(long categoryId, String token) throws InvalidAdvertiseIdException {
		advertiseRepository.deleteById(categoryId);
		return true;
	}

	@Override
	public List<AdvertiseDto> filterBasedAdvertise(@PathVariable String filter) {
		List<AdvertiseDto> ad = advertiseRepository.filterBasedAdvertise(filter);
	
		return ad;
		
		
			
	}

	@Override
	public Advertise searchAdvertise() {
		
		return null;
	}

	@Override
	public List<AdvertiseDto> findAdvertiseByStatusOrTitle(String text) {
		
		return advertiseRepository.findAdvertiseByStatusOrTitle(text);
	}

}
