package com.priya.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.priya.springboot.dto.UserRegistrationDto;
import com.priya.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
