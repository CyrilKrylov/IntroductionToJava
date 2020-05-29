package by.epam.module04.agregation_komposition.task4;

import java.util.Objects;

public class Account {

    private double balance;
    private boolean isOpened;
    private int accountNumber;

    public double getBalance() {
        return balance;
    }

    public Account setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public Account setOpened(boolean opened) {
        isOpened = opened;
        return this;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Account setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0 &&
                isOpened == account.isOpened &&
                accountNumber == account.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, isOpened, accountNumber);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName());
        sb.append("{");
        sb.append("balance=").append(balance);
        sb.append(", isOpened=").append(isOpened);
        sb.append(", accountNumber=").append(accountNumber);
        sb.append('}');
        return sb.toString();
    }
}
