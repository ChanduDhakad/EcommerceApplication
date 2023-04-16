package com.masai.service;
import java.util.List;

import com.masai.exception.UserException;

import com.masai.model.User;

public interface UserService {
	
	public User registerUser(User user);
	
	public User getUserDetailsByEmail(String email)throws UserException;
	
	public List<User> getAllUserDetails()throws UserException;

}
