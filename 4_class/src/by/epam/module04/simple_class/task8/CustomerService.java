package by.epam.module04.simple_class.task8;


import java.util.Arrays;

public class CustomerService {

	private Customer[] customers;
	private CardNumberRange cardNumberRange;

	public CustomerService(Customer[] customers, CardNumberRange cardNumberRange) {
		this.customers = customers;
		this.cardNumberRange = cardNumberRange;
	}

	public Customer[] getCustomersAlphabeticalOrder() {
		boolean isChanged;
		Customer[] customersForSorting;

		customersForSorting = Arrays.copyOf(this.customers, this.customers.length);

		for (int i = 0; i < customersForSorting.length - 1; i++) {
			isChanged = false;
			for (int j = 0; j < customersForSorting.length - i - 1; j++) {
				if (customersForSorting[j].getName()
						 .compareToIgnoreCase(customersForSorting[j + 1].getName()) > 0) {
					Customer buffer = customersForSorting[j];
					customersForSorting[j] = customersForSorting[j + 1];
					customersForSorting[j + 1] = buffer;
					isChanged = true;
				}
			}
			if (!isChanged) {
				break;
			}
		}
		return customersForSorting;
	}

	public Customer[] getCustomersWithCardNumberInRange() {
		Customer[] customersInRange;
		int newCustomersArrayLength;

		customersInRange = new Customer[this.customers.length];
		newCustomersArrayLength = 0;

		for (int i = 0; i < this.customers.length; i++) {
			if (this.cardNumberRange.isInRange(this.customers[i].getCreditCardNumber())) {
				customersInRange[newCustomersArrayLength++] = this.customers[i];
			}
		}

		return Arrays.copyOf(customersInRange, newCustomersArrayLength);
	}

	public Customer[] getCustomers() {
		return customers;
	}
}
