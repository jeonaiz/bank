package com.example.bank.controllers;

import com.example.bank.models.Account;
import com.example.bank.models.Balance;
import com.example.bank.services.AccountService;
import com.example.bank.services.BalanceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balance")
public class BalanceController {
    private final BalanceService balanceService;

    public BalanceController(BalanceService balanceService) {
        this.balanceService = balanceService;
    }

    @PostMapping("/save")
    public Balance save (@RequestBody Balance balance){

        return balanceService.save(balance);
    }
}
