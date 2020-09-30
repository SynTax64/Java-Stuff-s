package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing.LinkedListExample;

public class Customer {
    private String fullName;
    private double balance;

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }

    public Customer(String fullName, double balance) {
        this.fullName = fullName;
        this.balance = balance;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
