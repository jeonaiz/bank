package com.example.bank.controllers;

import com.example.bank.models.Account;
import com.example.bank.models.dto.AccountDto;
import com.example.bank.services.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    private  final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/save")
    public AccountDto save (@RequestBody AccountDto accountDto){ return accountService.save(accountDto);}
}
