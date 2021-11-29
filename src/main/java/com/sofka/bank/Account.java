package com.sofka.bank;

import com.sofka.bank.Statement;
import com.sofka.bank.Transaction;

import java.io.PrintStream;

public class Account {

    private Statement statement = new Statement();
    private Transaction transaction = new Transaction();

    public String date(String dateString){
        return dateString;
    }

    void deposit(double amount, String date) {
        transaction.credit(amount, date);
    }

    void withdraw(double amount, String date){
        transaction.debit(amount, date);
    }

    void sendMoney(double amount, String date){
        transaction.debit(amount, date);
    }

    void printStatement(PrintStream printer) {
        statement.statementTitle(printer);
        statement.printLines();
    }

}
