package com.bankingapp.bankingapp.service.Impl;

import com.bankingapp.bankingapp.entity.Bank;
import com.bankingapp.bankingapp.payload.BankDto;
import com.bankingapp.bankingapp.repository.BankRepository;
import com.bankingapp.bankingapp.service.BankService;
import org.aspectj.asm.IModelFilter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class BankServiceImpl implements BankService {
    private BankRepository bankRepository;

    private ModelMapper modelMapper ;

    public BankServiceImpl(BankRepository bankRepository, ModelMapper modelMapper) {
        this.bankRepository = bankRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public BankDto createBank(BankDto bankDto) {
        Bank bank = mapToEntity(bankDto);
        Bank newbank = bankRepository.save(bank);
        BankDto bankResponse = mapToDto(newbank);
        return bankResponse;
    }

    private BankDto mapToDto(Bank newBank) {

        BankDto bankDto =modelMapper.map(newBank, BankDto.class);
        return bankDto;
    }

    private Bank mapToEntity(BankDto bankDto){
       Bank bank =modelMapper.map(bankDto, Bank.class);
       return bank;
    }
}