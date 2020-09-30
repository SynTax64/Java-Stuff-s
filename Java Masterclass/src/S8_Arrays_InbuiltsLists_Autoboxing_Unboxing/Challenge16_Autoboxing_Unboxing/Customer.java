package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing.Challenge16_Autoboxing_Unboxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    private Double amount;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public void addTransaction(Double transaction) {
        this.transactions.add(transaction);
    }

    public void setAmount(Double amount) {
        this.amount = amount;
        System.out.println("Successfully added amount");
    }


    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void printTransactions() {
        int cTrans = 0;
        for (Double transaction : transactions) {
            System.out.println("Transaction #" + ++cTrans + ": " + transaction);
        }
    }

    public void getSumOfTransactions() {
        Double sum = 0.0;
        for (Double transaction : transactions) {
            sum += transaction;
        }
        this.amount -= sum;
    }
}
