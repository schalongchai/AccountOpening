package com.me.app.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.app.model.AoAccountInfo;
import com.me.app.repository.AoAccountInfoRepository;


@Service
public class AccountInfoService {
	@Autowired
	private AoAccountInfoRepository accountRepo;

	public List<AoAccountInfo> getAll() {
		List<AoAccountInfo> AoAccountInfos = (List<AoAccountInfo>) accountRepo.findAll();
		return AoAccountInfos;
	}

	public AoAccountInfo getById(Long id) {
		Optional<AoAccountInfo> AoAccountInfos = accountRepo.findById(id);
		return AoAccountInfos.isPresent() ? AoAccountInfos.get() : null;
	}

	public void deleteById(Long id) {
		accountRepo.deleteById(id);
	}

	public void Add(AoAccountInfo c) {
		if (!accountRepo.existsById(c.getId().getAcNo())) {
			accountRepo.save(c);
		}
	}

	public void Update(AoAccountInfo c) {
		if (accountRepo.existsById(c.getId().getAcNo())) {
			accountRepo.save(c);
		}
	}




}
