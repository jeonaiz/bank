package com.example.bank.services;

import com.example.bank.models.Account;
import com.example.bank.models.dto.AccountDto;

public interface AccountService {


    Account save(Account account);

    AccountDto save(AccountDto accountDto);
}
