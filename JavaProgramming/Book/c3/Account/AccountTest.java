package Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account(0);
        Account account2 = new Account(0);

        showBalances(account1, account2);

        System.out.print("Enter deposit amount to account1: ");
        account1.credit(input.nextDouble());

        showBalances(account1, account2);

        System.out.print("Enter deposit amount to account2: ");
        account2.credit(input.nextDouble());

        showBalances(account1, account2);

        input.close();
    }

    public static void showBalances(Account account1, Account account2) {
        System.out.printf("account1 balance: $ %.2f\n",
         account1.getBalance());
        System.out.printf("account2 balance: $ %.2f\n",
         account2.getBalance());
    }
}
