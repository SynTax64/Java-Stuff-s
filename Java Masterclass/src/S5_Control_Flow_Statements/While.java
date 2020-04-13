package S5_Control_Flow_Statements;

public class While {
    public static boolean isEvenNumber(int number) {
//        if (number % 2 == 0) { // longer way
//            return true;
//        } else {
//            return false;
//        }

        return (number % 2 == 0); // shorter way
    }

    public static void main(String[] args) {
//        int counter = 6;

        /*while (counter != 5) {
            System.out.println("The number is " + counter);
            counter++;
        }

        counter = 1;
        while (true) {
            if (counter == 5) {
                break;
            }
            System.out.println("The number is " + counter);
            counter++;
        }*/

//        do {
//            System.out.println("Count value was " + counter);
//            counter++;
//            if (counter > 100) {
//                break;
//            }
//        } while (counter != 5);
        int number = 4;
        int finishNumber = 30;
        int evenNumbersFound = 0;
        int sum = 0;
        while (number <= finishNumber) {
            number++;

            if (!isEvenNumber(number)) { // method return true if number is even, but here we negate that,
                continue;                // so we check if number is not the even number, if number is not even, than will execute
            }                            // continue statement, because method isEvenNumber return false, negates that result negate to true

            if (evenNumbersFound >= 5) {
                break;
            }
            evenNumbersFound++;
            sum += number;
            System.out.println("Even number " + number);
        }
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Even numbers found:" + evenNumbersFound);
    }
}
