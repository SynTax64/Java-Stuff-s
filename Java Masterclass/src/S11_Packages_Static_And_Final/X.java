package S11_Packages_Static_And_Final;

import java.util.Scanner;

public class X {
    private int x = 0;

    public X(Scanner x) {
        System.out.println("Enter the number: ");
        this.x = x.nextInt();
    }

    public void x() {
        for (int x = 0; x < 13; x++) {
            System.out.println(x + " times " + this.x + " equals " + this.x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        X x = new X(scanner);
        x.x();

    }
}
