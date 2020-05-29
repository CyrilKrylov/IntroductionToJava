package by.epam.module04.agregation_komposition.task4;

public class ClientService {

    private AccountService accountService;
    private Client client;
    private static int accountNumberPseudoSequence = 0;

    public ClientService(Client client) {
        this.client = client;
        this.accountService = new AccountService(client.getAccounts());
    }

    public Account findAccountByNumber(int accountNumber) {
        int indexOfAccount = accountService.findAccountIndexByNumber(accountNumber);
        if (indexOfAccount < 0) {
            return null;
        }
        return this.client.getAccounts()[indexOfAccount];
    }

    public void blockAccount(int accountNumber) {
        Account account;

        account = findAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Такого счета нет");
            return;
        }

        if (!account.isOpened()) {
            System.out.println("Счет уже заблокирован");
            return;
        }
        account.setOpened(false).setBalance(0.0);
        System.out.println("Средства выведены");

    }

    public void unlockAccount(int accountNumber) {
        Account account;

        account = findAccountByNumber(accountNumber);

        if (account == null) {
            System.out.println("Такого счета нет");
            return;
        }
        if (account.isOpened()) {
            System.out.println("Cчет уже был заблокирован");
            return;
        }

        account.setOpened(true);
    }

    public void topUpBalance(int accountNumber, double amount) {
        Account account = findAccountByNumber(accountNumber);
        double newBalance;

        if (account == null) {
            System.out.println("Такого счета нет");
            return;
        }

        if (!account.isOpened()) {
            System.out.println("Счет заблокирован, пополнение невозможно");
            return;
        }

        newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);
    }

    public void setUpAccount() {
        Account account = new Account()
                .setAccountNumber(++ClientService.accountNumberPseudoSequence)
                .setOpened(true);
        int newLength = this.client.getAccounts().length + 1;
        int insertionIndex = newLength - 1;
        Account[] accounts = new Account[newLength];

        for (int i = 0; i < client.getAccounts().length; i++) {
            if (account.getAccountNumber() < client.getAccounts()[i].getAccountNumber()) {
                insertionIndex = i;
                break;
            }
            accounts[i] = this.client.getAccounts()[i];
        }
        accounts[insertionIndex] = account;
        for (int i = insertionIndex + 1; i < accounts.length; i++) {
            accounts[i] = this.client.getAccounts()[i - 1];
        }
        this.client.setAccounts(accounts);
        this.accountService.setAccounts(client.getAccounts());

    }

    public void closeAccount(int accountNumber) {
        int oldLength;
        int newLength;
        int indexOfAccount;
        int nextIndex;
        Account[] accounts;

        oldLength = this.client.getAccounts().length;
        newLength = oldLength - 1;
        accounts = new Account[newLength];
        indexOfAccount = this.accountService.findAccountIndexByNumber(accountNumber);
        if (indexOfAccount < 0) {
            System.out.println("Такого счета нет");
            return;
        }
        nextIndex = indexOfAccount + 1;
        System.arraycopy(this.client.getAccounts(), 0,
                accounts, 0,
                indexOfAccount);
        System.arraycopy(this.client.getAccounts(), nextIndex,
                accounts, indexOfAccount,
                oldLength - indexOfAccount - 1);
        this.client.setAccounts(accounts);
        this.accountService.setAccounts(this.client.getAccounts());
    }

    public double getTotalAmount() {
        double outAmount = 0.0;

        for (int i = 0; i < this.client.getAccounts().length; i++) {
            if (!this.client.getAccounts()[i].isOpened()) {
                continue;
            }
            outAmount += this.client.getAccounts()[i].getBalance();
        }
        return outAmount;
    }

    public double getTotalAmountWithPositiveBalance() {
        double outAmount = 0.0;

        for (int i = 0; i < this.client.getAccounts().length; i++) {
            if (!this.client.getAccounts()[i].isOpened() || this.client.getAccounts()[i].getBalance() <= 0.0) {
                continue;
            }
            outAmount += this.client.getAccounts()[i].getBalance();
        }
        return outAmount;
    }
    public double getTotalAmountWithNegativeBalance() {
        double outAmount = 0.0;

        for (int i = 0; i < this.client.getAccounts().length; i++) {
            if (!this.client.getAccounts()[i].isOpened() || this.client.getAccounts()[i].getBalance() >= 0.0) {
                continue;
            }
            outAmount += this.client.getAccounts()[i].getBalance();
        }
        return outAmount;
    }

}
