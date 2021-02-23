import java.util.ArrayList;

public class Account {
	private String accountName; // never set to public
	private int balance = 0;// never set to public
	private ArrayList<Integer> transactions;// never set to public

	public Account(String accountName) {
		this.accountName = accountName;
		this.transactions = new ArrayList<Integer>();
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		if (amount > 0) {
			this.transactions.add(amount);
			this.balance += amount;
			System.out.println(amount + " deposited. Balance is now " + this.balance);
		} else {
			System.out.println("Can't deposit negative sums");
		}
	}

	public void withdraw(int amount) {
		int withdrawal = -amount;
		if (withdrawal < 0) {
			this.balance += withdrawal;
			this.transactions.add(withdrawal);
			System.out.println(amount + " withdrawn. Balance is now " + this.balance);
		} else {
			System.out.println("Can't withdraw negative sums");
		}
	}

	public void calculateBalance() {
		this.balance = 0;
		for (int el : transactions) {
			this.balance += el;
		}

		System.out.println("Calculated balance is " + this.balance);
	}

	public static void main(String[] args) {
		Account davidsAccount = new Account("David");
		davidsAccount.deposit(1000);
		davidsAccount.withdraw(500);
		davidsAccount.withdraw(-200);
		davidsAccount.deposit(-20);
		davidsAccount.calculateBalance();

		System.out.println("Balance account is " + davidsAccount.getBalance());
	}
}
