package S3_First_Steps;

public class OperatorsChallenge {
    public static void main(String[] args) {
        double myValue1 = 21.0d;
        double myValue2 = 80.0d;
        double myResult = (myValue1 + myValue2) * 100.0d;
        System.out.println("Myresult = " + myResult);

        myResult = myResult % 40.0;
        System.out.println("Remainder = " + myResult);
        boolean isNoRemainder = (myResult == 0) ? true : false;

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
