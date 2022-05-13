package com.zensar.olxadvertise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.olxadvertise.dto.AdvertiseDto;
import com.zensar.olxadvertise.entity.Advertise;

public interface OlxAdvertiseRepository extends JpaRepository<Advertise, Long>{

	@Query(value = "select * from advertise where status=?1 or title=?2 ",nativeQuery=true)
	List<AdvertiseDto> filterBasedAdvertise(String filter);
	
	@Query(value = "select * from advetise where status=?1 or title=?2",nativeQuery = true)
	List<AdvertiseDto> findAdvertiseByStatusOrTitle(String text);
}
