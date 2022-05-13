package com.zensar.olxadvertise.exception;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(InvalidAdvertiseIdException.class)
	public ResponseEntity<CustomResponse> handlestockerror(HttpServletResponse response) throws IOException{
		CustomResponse response1 = new CustomResponse();
		response1.setTimestamp(LocalDateTime.now());
		response1.setStatus(400);
		response1.setError("Invalid AdvertiseId");
		return new ResponseEntity<CustomResponse>(response1,HttpStatus.BAD_REQUEST);
	}

}
