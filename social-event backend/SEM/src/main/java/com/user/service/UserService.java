package com.user.service;

import com.user.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.user.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
	
}
