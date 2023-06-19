package com.lamlt15.exception;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(Long id) {
		super("Could not found the user with id: "+id);
		// TODO Auto-generated constructor stub
	}

	

	
}
