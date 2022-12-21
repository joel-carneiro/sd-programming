package Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Account.*;

public class TestLambda {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        Client c1 = new Client("Fernandes Felipe", "222.222.222-22");
        Client c2 = new Client("Silva Silveira", "333.222.333-22");
        Client c3 = new Client("Paulo Pereira", "444.222.444-22");
        Client c4 = new Client("Ariel Abel", "333.111.444-22");

        CurrentAccount account1 = new CurrentAccount(c1, 600, "06895-4", 0);
        CurrentAccount account2 = new CurrentAccount(c2, 200, "30495-3", 0);
        CurrentAccount account3 = new CurrentAccount(c3, 300, "03941-5", 0);
        CurrentAccount account4 = new CurrentAccount(c4, 200, "22345-2", 0);

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);

        // Lambdas expression

        accounts.sort( (Account o1, Account o2) -> {
            return Double.compare(o1.getBalance(), o2.getBalance());
        });

        accounts.forEach( (Account o1) -> System.out.println(o1));
    }
}

