package by.epam.module04.agregation_komposition.task4;

import java.util.Arrays;
import java.util.Comparator;

public class AccountService {

    private Account[] accounts;

    public AccountService(Account[] accounts) {
        this.accounts = accounts;
    }

    public int findAccountIndexByNumber(int accountNumber) {
        return Arrays.binarySearch(accounts,
                new Account().setAccountNumber(accountNumber),
                Comparator.comparingInt(Account::getAccountNumber));
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
