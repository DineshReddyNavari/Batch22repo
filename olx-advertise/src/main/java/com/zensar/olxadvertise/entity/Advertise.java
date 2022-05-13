package com.zensar.olxadvertise.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.ComponentScan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ComponentScan
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Advertise {
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
