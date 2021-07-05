package com.cg.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.models.Account;
import com.cg.models.Pack;
import com.cg.repositories.IAccountRepository;

@Service
@Component
public class AccountService implements IAccountService{
	
	@Autowired
	IAccountRepository accountRepository;

	@Override
	public Account createAccount(Account account) {
		return accountRepository.save(account) ;
	}

//	@Override
//	public Account findByAccountId(Long accountId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Account update(Account account) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteByAccountId(Long accountId) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public int countCreatedAccountsInPeriod(LocalDate startDate, LocalDate endDate) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int countCreatedAccount(LocalDate startDate, LocalDate endDate) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int countAccount() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void removePackForAccount(Account account, Pack pack) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

}
