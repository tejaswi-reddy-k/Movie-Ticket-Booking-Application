package com.movie.app.service;

import com.movie.app.entity.User;

public interface IUserService {
	
	public  User addNewUser(User user);
	public User signIn(User user);
	public User signOut(User user);

}
