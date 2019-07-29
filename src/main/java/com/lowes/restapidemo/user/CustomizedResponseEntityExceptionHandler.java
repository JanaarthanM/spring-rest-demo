package com.lowes.restapidemo.user;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	private SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSSSSS");

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest req) {
		ExceptionResponse response = new ExceptionResponse(sdf.format(new Date()), ex.getMessage(),
				req.getDescription(false));
		return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserDefinedException.class)
	public final ResponseEntity<Object> handleNotfoundExceptions(UserDefinedException ex, WebRequest req) {
		ExceptionResponse response = new ExceptionResponse(sdf.format(new Date()), ex.getMessage(),
				req.getDescription(false));
		return new ResponseEntity(response, HttpStatus.NOT_FOUND);
	}
}
