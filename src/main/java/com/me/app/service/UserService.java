package com.me.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.app.model.AoUser;
import com.me.app.repository.AoUserRepository;

@Service
public class UserService {
	@Autowired
	private AoUserRepository userRepo;

	public List<AoUser> getAll() {
		List<AoUser> AoUsers = (List<AoUser>) userRepo.findAll();
		return AoUsers;
	}

	public AoUser getById(Long id) {
		Optional<AoUser> AoUsers = userRepo.findById(id);
		return AoUsers.isPresent() ? AoUsers.get() : null;
	}

	public void deleteById(Long id) {
		userRepo.deleteById(id);
	}

	public void Add(AoUser c) {
		if (!userRepo.existsById(c.getUserId())) {
			userRepo.save(c);
		}
	}

	public void Update(AoUser c) {
		if (userRepo.existsById(c.getUserId())) {
			userRepo.save(c);
		}
	}


}
