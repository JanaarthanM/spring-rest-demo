package com.lowes.restapidemo.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND )
public class UserDefinedException extends RuntimeException {

	public UserDefinedException(String message) {
		super("Object " + message + " is not found !!!");
	}
}
