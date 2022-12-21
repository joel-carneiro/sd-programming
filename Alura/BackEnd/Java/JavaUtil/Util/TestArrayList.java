package Util;

import java.util.ArrayList;

import Account.Account;
import Account.Client;
import Account.CurrentAccount;

public class TestArrayList {
    public static void main(String[] args) {
        
        // ArrayList implementa List
        ArrayList<Account> accounts = new ArrayList<Account>();

        Client c1 = new Client("Fernandes Felipe", "222.222.222-22");
        Client c2 = new Client("Silva Silveira", "333.222.333-22");
        Client c3 = new Client("Paulo Pereira", "444.222.444-22");

        CurrentAccount account1 = new CurrentAccount(c1, 0, "06895-3", 0);
        CurrentAccount account2 = new CurrentAccount(c2, 0, "06895-3", 0);
        CurrentAccount account3 = new CurrentAccount(c3, 0, "03941-5", 0);

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        accounts.remove(account1);

        // System.out.println(account1.equals(account2));

        System.out.println(accounts);
    }
}
