package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.UserException;
import com.masai.model.User;
import com.masai.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User registerUser(User User) throws UserException {
		
		return userRepository.save(User);
		
		
	}

	@Override
	public User getUserDetailsByEmail(String email)throws UserException {
		
		return userRepository.findByEmail(email).orElseThrow(() -> new UserException("User Not found with Email: "+email));
	}

	@Override
	public List<User> getAllUserDetails()throws UserException {
		
		List<User> Users= userRepository.findAll();
		
		if(Users.isEmpty())
			throw new UserException("No User find");
		
		return Users;
		
	}

}
