package com.bankingapp.bankingapp.controller;

import com.bankingapp.bankingapp.payload.BankDto;
import com.bankingapp.bankingapp.service.BankService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/banks")
public class BankController {
private BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }
    @PostMapping
    public ResponseEntity<BankDto> createBank(@RequestBody BankDto bankDto){
        return new ResponseEntity<>(bankService.createBank(bankDto), HttpStatus.CREATED);
    }
}
