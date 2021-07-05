package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.models.Account;
import com.cg.services.IAccountService;

@RestController
@RequestMapping("/api")
public class AccountController {
	
	@Autowired
	IAccountService accountService;
	
	@GetMapping("get")
	public List<Account> getAccounts(){
		return accountService.findAll();
	}
	
	@PostMapping("accounts")
	public Account createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
}
