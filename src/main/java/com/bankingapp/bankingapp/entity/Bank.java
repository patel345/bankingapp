package com.bankingapp.bankingapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="banks",uniqueConstraints = {@UniqueConstraint(columnNames= "bankName")})
public class Bank {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String bankName;
    @Column(nullable = false)
    private String branchName;
    @Column(nullable = false)
    private  String branchIfscCode;
    @Column(nullable = false)
    private String branchCategory;

}
