package S5_Control_Flow_Statements;

public class Coding12_NumberToWords {
//    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//        System.out.println(reverse(1000));
//    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
//            number = reverse(number);

            String output = "";
            for (int i = 0; i > getDigitCount(number); i++) {
                String stringNumber = reverse(number);
                do {
//                    int lastDigit = number % 10;

                    switch (stringNumber.charAt(i)) {
                        case '0':
                            output += "Zero ";
                            break;
                        case '1':
                            output += "One ";
                            break;
                        case '2':
                            output += "Two ";
                            break;
                        case '3':
                            output += "Three ";
                            break;
                        case '4':
                            output += "Four";
                            break;
                        case '5':
                            output += "Five ";
                            break;
                        case '6':
                            output += "Six ";
                            break;
                        case '7':
                            output += "Seven ";
                            break;
                        case '8':
                            output += "Eight ";
                            break;
                        case '9':
                            output += "Nine ";
                            break;
                    }
                    number /= 10;
                }
                while (number != 0);
            }

            System.out.println(output.trim());
        }
    }

    public static String reverse(int number) {
        String reverseNumber = "";

        while (number != 0) {
            int lastDigit = number % 10;
            reverseNumber += (lastDigit == 0) ? "0" : lastDigit;
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        int digitCounter = 0;
        if (number < 0) {
            return -1;
        }
        do {
            digitCounter++;
            number /= 10;
        }
        while (number != 0);

        return digitCounter;
    }
}
