package by.epam.module04.agregation_komposition.task4;

import java.util.Arrays;
import java.util.Comparator;

public class Client {

    private Account[] accounts;

    public Client() {
        this.accounts = new Account[0];
    }

    public Client(Account[] accounts) {
        Arrays.sort(accounts, Comparator.comparingInt(Account::getAccountNumber));
        this.accounts = accounts;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
