package com.arun.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.arun.entity.Pen;
import com.arun.repo.PenRepo;


@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private PenRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		// loading user from database by username
		Optional<Pen> user = this.userRepo.findByEmail(username);
				

		return user;
	}

}
