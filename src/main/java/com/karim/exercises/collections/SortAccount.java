package com.karim.exercises.collections;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortAccount {
    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        /**
         * Constructor
         * @param amount amount
         * @param interestRate interestRate
         * @param duePayment duePayment
         */
        public Account(double amount, double interestRate, LocalDateTime duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        /**
         * Getters
         * @return the attributes
         */
        public double getAmount() {
            return amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public LocalDateTime getDuePayment() {
            return duePayment;
        }
    }

    public static void sortByAmount(List<Account> accounts) {
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Double.compare(o1.getAmount(), o2.getAmount());
            }
        });
    }
    public static void sortByInterestRate(List<Account> accounts) {
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Double.compare(o1.getInterestRate(), o2.getInterestRate());
            }
        });
    }
    public static void sortByDuePayment(List<Account> accounts) {
        Collections.sort(accounts, (o1, o2) -> o1.getDuePayment().compareTo(o2.getDuePayment()));
    }


}
