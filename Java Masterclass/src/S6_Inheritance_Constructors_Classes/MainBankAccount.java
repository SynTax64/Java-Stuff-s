package S6_Inheritance_Constructors_Classes;

public class MainBankAccount {
    public static void main(String[] args) {
        Challenge7_BankAccount ba = new Challenge7_BankAccount(1001,15200,"David A.","davidas@gmail.com","0012/34-567-89-00");
        /*ba.setCustomerName("David A.");
        ba.setEmail("davida@gmail.com");
        ba.setID(1001);
        ba.setNumber("0012/34-567-89-00");
        ba.setBalance(15200);*/

        ba.deposit(2000);
        ba.withdraw(20000);
        ba.withdraw(16200);

    }
}
