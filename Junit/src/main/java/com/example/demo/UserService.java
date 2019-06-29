package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public User getUser()
	{
		return getPrivateMethod();
	}

	private User getPrivateMethod() {
		User u  = new User();
		u.setName("Pratik");
		return u;
	}
}
