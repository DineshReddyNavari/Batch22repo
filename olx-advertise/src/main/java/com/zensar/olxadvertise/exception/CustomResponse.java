package com.zensar.olxadvertise.exception;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class CustomResponse {
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-Mm-dd hh:mm:ss")
	private LocalDateTime timestamp;
	private int status;
	private String error;

}
