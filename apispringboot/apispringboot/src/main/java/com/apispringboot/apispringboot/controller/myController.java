package com.apispringboot.apispringboot.controller;

//import org.springframework.stereotype.Controller;
import com.apispringboot.apispringboot.entities.Bank;
import com.apispringboot.apispringboot.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
public class myController {
    @Autowired
    private BankService bankservice;

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home page";
    }

    //get the banks
    @GetMapping("/banks")
    public List<Bank> getBanks(){
        return this.bankservice.getBanks();
    }

    //get the bank with the bankId
    @GetMapping("/banks/{bankId}")
    public Bank getBank(@PathVariable String bankId){
        return this.bankservice.getBank(Long.parseLong(bankId));
    }

    //add the bank
    @PostMapping("/banks")
    public Bank addBank(@RequestBody Bank bank){
        return this.bankservice.addBank(bank);
    }
}
