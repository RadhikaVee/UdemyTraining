package com.radhika;

public class Main {
        public static void main(String[] args) {
            Account radAccount = new Account("Radhika");
            radAccount.deposit(10000);
            radAccount.withdraw(5000);
            radAccount.withdraw(-2000);
            radAccount.deposit(-200);
            radAccount.calculateBalance();
            radAccount.balance = 50000;

            System.out.println("Balance on account is " + radAccount.getBalance());
            radAccount.transactions.add(45000);
            radAccount.calculateBalance();
        }
    }


