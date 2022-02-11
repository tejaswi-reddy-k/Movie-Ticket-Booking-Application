package com.movie.app.repository;

import com.movie.app.entity.User;

public interface IUserService {
	
	public  User addNewUser(User user);
	public User signIn(User user);
	public User signOut(User user);

}
