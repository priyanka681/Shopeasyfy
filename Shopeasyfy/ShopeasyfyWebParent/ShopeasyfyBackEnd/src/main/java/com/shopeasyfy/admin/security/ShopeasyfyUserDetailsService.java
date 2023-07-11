package com.shopeasyfy.admin.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.shopeasyfy.admin.user.UserRepository;
import com.shopeasyfy.entity.User;

public class ShopeasyfyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepo.getUserByEmailUser(email);
		System.out.println(user.getEmail());
		if(user != null) {
			return new ShopeasyfyUserDetails(user);
		}
		
		throw new UsernameNotFoundException("Could not find user with email:" +email);
	}

}
