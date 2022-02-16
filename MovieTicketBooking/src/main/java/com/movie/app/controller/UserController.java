package com.movie.app.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.app.entity.User;
import com.movie.app.exceptions.UserNotFoundException;
import com.movie.app.repository.UserDto;
import com.movie.app.service.IUserService;



@RestController
public class UserController {
	
    private IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    } 
    
    @GetMapping("/updateUser/{userId}")
    public User updateUser(@PathVariable  int userId){
    	return userService.updateUser(updateUser(0), userId);
    	
	}
    
    @PostMapping("/Login")
    public boolean dologin(@RequestBody UserDto userDto,HttpServletRequest request)
    {
    	boolean isUserValidated = false;
    	if(userDto.getUserName().equals("user")&&userDto.getPassword().equals("12563hgrt"))
    	{
    		isUserValidated=true;
    		HttpSession session = request.getSession(true);
    		List<String> booking=new ArrayList<>();
    		session.setAttribute("userId", booking);
    		session.setAttribute("userName", booking);
    		session.setAttribute("userEmail", booking);
    		session.setAttribute("LoginTime", LocalTime.now());
    		session.setAttribute("LoginDate", LocalDate.now());
    		
    		
    	}
    	return isUserValidated;
    }
    @GetMapping("/Logout")
    public String Logout(HttpServletRequest req)
    {
    	HttpSession session = req.getSession(false);
    	if(session!=null)
    	{
    		session.invalidate();
    	}
    	return "User has Logged Out";
    }
    @DeleteMapping("/deleteuser/{userid}")	public ResponseEntity<String> deleteUserById(@PathVariable("userid") Integer user_id) throws UserNotFoundException {
    	  userService.deleteUserById(user_id);;
		return new ResponseEntity<String>(HttpStatus.OK);
	}
    @GetMapping("/getUser/{userid}")
	public User getUserById(int user_id) {
	return userService.getUserById(user_id);
	}
    
	
    
    
}
