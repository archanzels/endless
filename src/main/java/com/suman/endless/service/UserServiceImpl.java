package com.suman.endless.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.suman.endless.model.Role;
import com.suman.endless.model.User;
import com.suman.endless.mymaps.GoogleGeoCodeResponse;
import com.suman.endless.mymaps.MyMapController;
import com.suman.endless.repository.RoleRepository;
import com.suman.endless.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public com.suman.endless.model.User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(com.suman.endless.model.User user, String location) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setActive(true);
		Role userRole = roleRepository.findByRole("USER");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		/* Calculate the coordinates of new user */
		GoogleGeoCodeResponse geo = MyMapController.getLatLong(location);
		double lat = Double.parseDouble(geo.results[0].geometry.location.lat);
		double lng = Double.parseDouble(geo.results[0].geometry.location.lng);
		user.setLat(lat);
		user.setLng(lng);
		userRepository.save(user);
	}

	// show the user details
	@Transactional
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		userRepository.deleteById(id);

	}
}
