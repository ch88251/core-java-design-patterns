package com.cfhayes.patterns.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternTests {

    @Test
    @DisplayName("Create bank account with initial balance of $500.00 dollars")
    public void createBankAccountScenario1() {
        BankAccount bankAccount = new BankAccount.Builder(500L)
                .withOwnerName("John Doe")
                .withOwnerAddress("123 Fake Street")
                .withOpeningBalance(Double.valueOf(500.00))
                .build();

        assertEquals("John Doe", bankAccount.getOwnerName(), "Wrong owner name!");
        assertEquals("123 Fake Street", bankAccount.getOwnerAddress(), "Wrong owner address!");
        assertEquals(500, bankAccount.getAccountBalance(), "Wrong account balance!");

    }

    @Test
    @DisplayName("Create bank account with initial balance of $500.01 dollars")
    public void createBankAccountScenario2() {
        BankAccount bankAccount = new BankAccount.Builder(1001L)
                .withOwnerName("John Doe")
                .withOwnerAddress("123 Fake Street")
                .withOpeningBalance(Double.valueOf(500.01))
                .build();

        assertEquals("John Doe", bankAccount.getOwnerName(), "Wrong owner name!");
        assertEquals("123 Fake Street", bankAccount.getOwnerAddress(), "Wrong owner address!");
        assertEquals(Double.valueOf("500.01"), bankAccount.getAccountBalance(), "Wrong account balance!");

    }

    @Test
    @DisplayName("Create bank account with initial balance of $600.55 dollars")
    public void createBankAccountScenario3() {
        BankAccount bankAccount = new BankAccount.Builder(1001L)
                .withOwnerName("John Doe")
                .withOwnerAddress("123 Fake Street")
                .withOpeningBalance(Double.valueOf(600.55))
                .build();

        assertEquals("John Doe", bankAccount.getOwnerName(), "Wrong owner name!");
        assertEquals("123 Fake Street", bankAccount.getOwnerAddress(), "Wrong owner address!");
        assertEquals(600.55, bankAccount.getAccountBalance(), "Wrong account balance!");

    }
}
