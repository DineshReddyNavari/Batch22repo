package com.zensar.olxadvertise.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.ComponentScan;

import com.zensar.olxadvertise.entity.Advertise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ComponentScan
@NoArgsConstructor
@AllArgsConstructor
public class AdvertiseDto {
	private String title;
	private long price;
	private String description;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long categoryId;
	private String username;
	private int createddate;
	private String status;

}
