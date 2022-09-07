package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
@Service
public class UserServiceImpl implements UserService {
	
	
	List<User> list=List.of(
			new User(1L, "Shantanu", "9878546532"),
			new User(2L, "Raj", "8789546532"),
			new User(3L, "Rajesh", "9557351565"),
			new User(4L, "Rakesh", "7845896554"),
			new User(5L, "Rahul", "9871542635"));
	

	@Override
	public User getuser(long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user->user.getUserid().equals(id)).findAny().orElse(null);
	}

}
