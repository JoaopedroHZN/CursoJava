package application;

import entities.Account;
import entities.SavingsAccounts;

public class Progam {

    public static void main(String[] args){

        Account x  = new Account(102,"Alex", 1000.0);
        Account y = new SavingsAccounts(1023,"Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);
    }
}
