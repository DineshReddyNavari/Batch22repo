package com.zensar.olxadvertise.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.olxadvertise.dto.AdvertiseDto;
import com.zensar.olxadvertise.entity.Advertise;
import com.zensar.olxadvertise.exception.InvalidAdvertiseIdException;
@Service
public interface OlxAdvertiseService {
	public List<Advertise> getAllAdvertises();
	public Advertise createAdvertise(Advertise advertise,String token);
	public Advertise getAdvertise(long categoryId) throws InvalidAdvertiseIdException;
	public AdvertiseDto updateAdvertise(long categoryId,Advertise advertise) throws InvalidAdvertiseIdException;
	public List<Advertise> getAllAdvertise(String token);
	public Advertise getAdvertise(long categoryId,String token) throws InvalidAdvertiseIdException;
	public boolean deleteAdvertise(long categoryId,String token) throws InvalidAdvertiseIdException;
	public List<AdvertiseDto> filterBasedAdvertise(String filter);
	public Advertise searchAdvertise();
	public List<AdvertiseDto> findAdvertiseByStatusOrTitle(String text);
	
	

}
