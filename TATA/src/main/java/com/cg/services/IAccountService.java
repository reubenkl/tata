package com.cg.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.models.Account;
import com.cg.models.Pack;

@Service
public interface IAccountService {
	
	//changed from add to addAccount
	Account createAccount(Account account);

//    Account findByAccountId(Long accountId) ;
//
//    Account update(Account account);
    
    List<Account> findAll();

//    void deleteByAccountId(Long accountId);
//
//    int countCreatedAccountsInPeriod(LocalDate startDate, LocalDate endDate);
//
//  //removed s in accounts
//    int countCreatedAccount(LocalDate startDate, LocalDate endDate);
//
//    /**
//     * finds count of accounts in the application
//     */
//  //removed s in accounts
//    int countAccount();
//
//    void removePackForAccount(Account account, Pack pack);
}
