package S3_First_Steps;

public class Challenge_PrimitiveTypes {
    public static void main(String[] args) {
        byte myByteVal = 10;
        short myShorVal = 20;
        int myIntVal = 50;
        long myLongVal = 50000L + (10L * (myByteVal + myShorVal + myIntVal));
        System.out.println(myLongVal);
    }
}
