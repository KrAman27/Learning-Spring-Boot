package com.apispringboot.apispringboot.services;

import com.apispringboot.apispringboot.entities.Bank;

import java.util.List;

public interface BankService {

    public List<Bank> getBanks();
    public Bank getBank(long bankId);
    public Bank addBank(Bank bank);
}
