package com.cfhayes.patterns.builder;

import java.math.BigDecimal;
import lombok.ToString;

@ToString
public class BankAccount {

    private long accountNumber;
    private String ownerName;
    private String ownerAddress;
    private double accountBalance;

    private BankAccount() {}

    public static class Builder {
        private long accountNumber;
        private String ownerName;
        private String ownerAddress;
        private double accountBalance;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public Builder withOwnerAddress(String ownerAddress) {
            this.ownerAddress = ownerAddress;
            return this;
        }

        public Builder withOpeningBalance(double accountBalance) {
            this.accountBalance = accountBalance;
            return this;
        }

        public BankAccount build() {
            BankAccount bankAccount = new BankAccount();
            bankAccount.accountNumber = this.accountNumber;
            bankAccount.ownerName = this.ownerName;
            bankAccount.ownerAddress = this.ownerAddress;
            bankAccount.accountBalance = this.accountBalance;
            return bankAccount;
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

}
