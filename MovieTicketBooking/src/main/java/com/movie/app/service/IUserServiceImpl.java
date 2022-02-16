package com.movie.app.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.movie.app.entity.User;
import com.movie.app.repository.IUserRepository;

@Service
@Primary
public class IUserServiceImpl implements IUserService {
    private IUserRepository userRepository;

    public IUserServiceImpl( IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    

    @Override
    public User addUser(User newUser) {
        return null;
    }

    

	@Override
	public User getUserById(long user_id) {
		// TODO Auto-generated method stub
		return userRepository.findById(user_id).get();
	}

	@Override
	public User updateUser(User updatedUser, long user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(long user_id) {
		userRepository.deleteById(user_id);
		
	}

}
