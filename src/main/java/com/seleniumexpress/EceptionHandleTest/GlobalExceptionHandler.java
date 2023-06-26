package com.seleniumexpress.EceptionHandleTest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class GlobalExceptionHandler {

	@ExceptionHandler(DatabaseConnectionFailedException.class)

	public ResponseEntity<ErrorResponse> handleDatabaseConnectionException(Exception ex) {
		// Log the exception or perform any other necessary actions

		ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),"Internal Server Error can not connect Adress microservice",ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
	}
}