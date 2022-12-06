package com.itr.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@RequestMapping(value = "/error")
public class ExcepcionNotFound extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ExcepcionNotFound(String message) {
		super(message);
	}
}
