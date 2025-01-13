package com.java.stringprob;

public record UserDto(Long id, String name,String email) {

	public Long id() {
		return id;
	}

	public String name() {
		return name;
	}

	public String email() {
		return email;
	}
	
	
}
