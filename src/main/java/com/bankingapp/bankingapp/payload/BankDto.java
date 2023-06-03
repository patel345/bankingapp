package com.bankingapp.bankingapp.payload;

import lombok.Data;

@Data
public class BankDto {
    private long id;
    private String bankName;
    private String branchName;
    private String branchIfscCode;
    private String branchCategory;
}
