package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing.Challenge16_Autoboxing_Unboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer, Double amount) {
        if (isCustomerExist(customer.getName())) {
            System.out.println("Customer " + customer.getName() + " already exist");
        } else {
            this.customers.add(customer);
            System.out.println("Customer " + customer.getName() + " successfully created");
            customer.setAmount(amount);
            System.out.println("Initial amount of " + customer.getName() + ": " + amount);
        }
    }

    public boolean isCustomerExist(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void printCustomers() {
        int numberOfCustomers = customers.size();
        System.out.println("Branch has " + numberOfCustomers + " customers");
        for (int i = 0; i < numberOfCustomers; i++) {
            System.out.println((i + 1) + "# Customer: " + "\n\tName: " + customers.get(i).getName()
                    + "\n\tAmount: " + customers.get(i).getAmount());
            System.out.println("Transactions: ");
            customers.get(i).printTransactions();
        }
    }

    public void addCustomerTransaction(String name, Double transaction) {
        if (isCustomerExist(name)) {
            for (Customer customer : customers) {
                if ((customer.getName().equals(name))) {
                    customer.addTransaction(transaction);
                }
            }
        } else {
            System.out.println("This Customer not exist");
        }
    }
}
