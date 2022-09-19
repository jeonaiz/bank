package com.example.bank.models.dto;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;



@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientInfoDto {
    Long id;
    String name;

    ClientDto client;
    AccountDto account;
}
