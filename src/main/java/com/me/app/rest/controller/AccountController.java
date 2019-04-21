package com.me.app.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.me.app.model.AoAccountInfo;
import com.me.app.model.CustomResponse;
import com.me.app.service.AccountInfoService;


@RestController
@RequestMapping("/api")

public class AccountController {
	@Autowired
	AccountInfoService accountService;
	CustomResponse cRes;
	

	@RequestMapping(value = "/customers/{cifno}/accounts/", method = RequestMethod.GET)
	public ResponseEntity<List<AoAccountInfo>> getAll(@PathVariable("cifno") Long cifno) {
		List<AoAccountInfo> c = accountService.getByCif(cifno);
		if(!c.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).body(c);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(c);
		}
	}

	@RequestMapping(value = "/customers/{cifno}/accounts/{id}", method = RequestMethod.GET)
	public ResponseEntity<AoAccountInfo> getByCIFAndAcctNo(@PathVariable("cifno") Long cifno,@PathVariable("id") Long acctNo) {
		AoAccountInfo c = accountService.getByCifAndAccountNo(cifno,acctNo);
		if(c!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(c);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(c);
		}
	}


	@RequestMapping(value = "/customers/{cifno}/accounts/", method = RequestMethod.PUT)
	public ResponseEntity<AoAccountInfo> updateByID(@PathVariable("cifno") Long cifno, @RequestBody AoAccountInfo c) {
		c.getId().setCifNo(cifno);
		accountService.Update(c);
		return ResponseEntity.status(HttpStatus.OK).body(c);
	}

	@RequestMapping(value = "/customers/{cifno}/accounts/", method = RequestMethod.POST)
	public ResponseEntity<CustomResponse> addByID(@PathVariable("cifno") Long cifno, @RequestBody AoAccountInfo c) {
		
		c.getId().setCifNo(cifno);
		cRes = accountService.Add(c);
		
		if(cRes.getError().equals("")) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(cRes);
		}
	}

	@RequestMapping(value = "/customers/{cifno}/accounts/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<CustomResponse> deleteByID(@PathVariable("cifno") Long cifno, @PathVariable("id") Long acctNo) {
		if(cifno!=null && acctNo!=null) {
			cRes = accountService.deleteByCifAndId(cifno, acctNo);

		}
		
		if(cRes.getError().equals("")) {
			return ResponseEntity.status(HttpStatus.OK).build();
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(cRes);
		}
		



	}

}
