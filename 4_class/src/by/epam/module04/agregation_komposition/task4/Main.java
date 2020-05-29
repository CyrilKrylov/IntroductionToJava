package by.epam.module04.agregation_komposition.task4;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно*/

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        accounts[0] = new Account().setAccountNumber(2).setBalance(-1).setOpened(true);
        accounts[1] = new Account().setAccountNumber(1).setBalance(-2).setOpened(true);
        accounts[2] = new Account().setAccountNumber(6).setBalance(-3).setOpened(true);
        accounts[3] = new Account().setAccountNumber(5).setBalance(4).setOpened(true);
        accounts[4] = new Account().setAccountNumber(4).setBalance(5).setOpened(true);

        AccountService accountService = new AccountService(accounts);
        Client client = new Client(accounts);
        ClientService clientService = new ClientService(client);

        System.out.println(accountService.findAccountIndexByNumber(5));

        clientService.setUpAccount();
        clientService.setUpAccount();
        System.out.println(Arrays.toString(client.getAccounts()));

        clientService.closeAccount(3);
        System.out.println(Arrays.toString(client.getAccounts()));
        System.out.println(clientService.getTotalAmount());
        System.out.println(clientService.getTotalAmountWithNegativeBalance());
        System.out.println(clientService.getTotalAmountWithPositiveBalance());
    }

}
