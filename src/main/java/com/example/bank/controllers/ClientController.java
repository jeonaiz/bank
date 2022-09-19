package com.example.bank.controllers;

import com.example.bank.models.Account;
import com.example.bank.models.Balance;
import com.example.bank.models.Client;
import com.example.bank.services.BalanceService;
import com.example.bank.services.ClientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/save")
    public Client save (@RequestBody Client client){

        return clientService.save(client);
    }
}
