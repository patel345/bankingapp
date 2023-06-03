package com.bankingapp.bankingapp.repository;

import com.bankingapp.bankingapp.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,Long> {
}
