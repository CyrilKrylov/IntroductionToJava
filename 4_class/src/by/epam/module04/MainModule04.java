package by.epam.module04;

import by.epam.module04.simple_class.task8.CardNumberRange;
import by.epam.module04.simple_class.task8.Customer;
import by.epam.module04.simple_class.task8.CustomerService;

import java.util.Arrays;

public class MainModule04{

  public static void main(String[] args){

    Customer customer = new Customer();
    Customer customer1 = new Customer();
    Customer customer2 = new Customer();

    customer1.setName("Лёвик");
    customer2.setName("Ксюша");
    CustomerService customerService = new CustomerService(
           new Customer[]{customer, customer1, customer2},
           new CardNumberRange(300, 310));
    System.out.println(Arrays.toString(customerService.getCustomersAlphabeticalOrder()));

    customer1.setCreditCardNumber(200);
    customer2.setCreditCardNumber(309);

    Customer[] customers = customerService.getCustomersWithCardNumberInRange();

    System.out.println(Arrays.toString(customers));

  }

}
