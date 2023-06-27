package com.karim.exercises.oop.basic;

public class BankAccount {
    double balance;

    /**
     * first constructor
     */
    public BankAccount() {
        this.balance = 0;
    }

    /**
     * second constructor
     * @param balance
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * getter
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposits the specified amount to the bank account
     * @param amount the amount to be deposited
     */
    public void deposit(double amount) {
        balance += amount;
    }


    /**
     * Withdraw the specified amount from the bank account
     * @param amount the amount to be withdrawn
     */
    public void withdraw(double amount) {
        if(checkNonNegativeBalance(amount)) {
            balance -= amount;
        }
        throw new IllegalArgumentException("You can't withdraw that amount because you don't have it");
    }

    /**
     * Ritorna vero se posso prelevare tot denaro, altrimenti ritorna falso
     * è un metodo di servizio (infatti l'ho messo privato), per far capire meglio a chi dovrà leggere il codice tra un bel po' di tempo
     * @param amount
     * @return
     */
    private boolean checkNonNegativeBalance(double amount) {
        if(balance - amount >= 0) {
            return true;
        }
        return false;
    }
}
