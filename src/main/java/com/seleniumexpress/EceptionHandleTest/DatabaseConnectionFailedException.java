package com.seleniumexpress.EceptionHandleTest;

public class DatabaseConnectionFailedException extends RuntimeException {

	public DatabaseConnectionFailedException(String messege) {
		super(messege);
		
	}

	
}