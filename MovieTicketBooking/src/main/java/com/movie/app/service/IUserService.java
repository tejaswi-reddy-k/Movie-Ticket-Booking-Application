package com.movie.app.service;

import java.util.List;

import com.movie.app.entity.User;

public interface IUserService {
	public List<User> getAllUsers();
	public User getUserById(long user_id);
	public User addUser(User newUser);
	public User updateUser(User updatedUser,long user_id);
	public void deleteUserById(long user_id);


}

