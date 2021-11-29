package com.sofka.bank;

import com.sofka.bank.Statement;

import java.text.DecimalFormat;

public class StatementLine {

    private Statement statement = new Statement();

    public StatementLine() {
    }

    public String decimalFormatter(double amount){
        DecimalFormat df = new DecimalFormat("########.00");
        return df.format(amount);
    }

    public void saveCreditLine(String date, double credit, double balance) {
        String line = ("|" + date + "| " + decimalFormatter(credit) + " |        " + "  |  " + decimalFormatter(balance) + "   |");
        statement.addStatementLine(line);
    }

    public void saveDebitLine(String date, double debit, double balance) {
        String line = ("|" + date + "| " + "        |  " + decimalFormatter(debit) + "  |  " + decimalFormatter(balance) + "   |");
        statement.addStatementLine(line);
    }
}
