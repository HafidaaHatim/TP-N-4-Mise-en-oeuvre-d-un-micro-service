package com.example.bankaccountservice.entities;

import com.example.bankaccountservice.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@NoArgsConstructor @AllArgsConstructor @Data
@Builder

public class BankAccount {
    @Id
    private String id;
    private Double balance;
    private Date createAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Enumerated(EnumType.STRING)
    //private AccountStatus status;
   // @ManyToOne
    @ManyToOne
    private Customer customer;

}
