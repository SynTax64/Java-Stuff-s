package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class Coding3_BarkingDog {
    public static void main(String[] args) {

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {

        if ((hourOfTheDay >= 0) && (hourOfTheDay <= 23)) {
            if (barking == true && (hourOfTheDay < 8 || hourOfTheDay > 22)) {
                return true;
            } else
                return false;
        } else {
            return false;
        }
    }
}
