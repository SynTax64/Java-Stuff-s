package S6_Inheritance_Constructors_Classes;

public class Challenge7_BankAccount {
    private int ID;
    private int balance;
    private String customerName;
    private String email;
    private String number;

    public Challenge7_BankAccount(int ID, int balance, String customerName, String email, String number) {
        this.ID = ID;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.number = number;

        System.out.println("You are constructor with parameters called");
    }

    public Challenge7_BankAccount() {
//        this(1001, 15200, "David A.", "davidas@gmail.com", "0012/34-567-89-00");
        System.out.println("You are constructor without parameters called");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void deposit(int value) {
        setBalance(value);
        System.out.println("Your money state of balance: " + getBalance());
    }

    public void withdraw(int value) {
        if (value > getBalance()) {
            System.out.println("You haven't enough money on your account");
            System.out.println("Your state of money: " + getBalance());
        } else {
            System.out.println("You have withdraw " + value);
            this.balance -= value;
            System.out.println("Your new money balance: " + getBalance());

        }
    }
}
