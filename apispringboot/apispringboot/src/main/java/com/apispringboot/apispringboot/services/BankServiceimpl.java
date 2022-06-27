package com.apispringboot.apispringboot.services;

import com.apispringboot.apispringboot.entities.Bank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankServiceimpl implements BankService{

    List<Bank> list;

    public BankServiceimpl() {
        list = new ArrayList<>();
        list.add(new Bank(72551349, "JP Morgan & Chase", "New York City"));
        list.add(new Bank(83882609, "World Bank", "Washington D.C."));
    }
    @Override
    public List<Bank> getBanks() {
        return list;
    }

    @Override
    public Bank getBank(long bankId){

        for(Bank bank : list) {
            if (bank.getId() == bankId) {
                return bank;
            }
        }
        return null;
    }

    @Override
    public Bank addBank(Bank bank){
        list.add(bank);
        return bank;
    }

}
