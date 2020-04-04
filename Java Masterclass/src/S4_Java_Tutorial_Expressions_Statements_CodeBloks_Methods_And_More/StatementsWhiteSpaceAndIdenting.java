package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class StatementsWhiteSpaceAndIdenting {

    public static void main(String[] args) {
        int myVariable = 50; // entire line is statement

        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++; //is also statement
        System.out.println(myVariable); //also Java statement

        System.out.println("This is" + " another " + "still more");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");

    }
}
