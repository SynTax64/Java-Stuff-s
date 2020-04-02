package S3_First_Steps;

public class FloatAndDouble {
    public static void main(String[] args) {
/*        float myFloatVal = Float.MAX_VALUE;
        double myDoubleVal = Double.MAX_VALUE;

        System.out.printf("%f\n", Float.MAX_VALUE);
        System.out.printf("%f", Double.MAX_VALUE);*/

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

        System.out.println("Min value of Float:" + myMinFloat);
        System.out.println("Min value of Float:" + myMaxFloat);
        System.out.println("Min value of Double:" + myMinDouble);
        System.out.println("Min value of Double:" + myMaxDouble);

        System.out.printf("%f\n", myMinFloat);
        System.out.printf("%f\n", myMaxFloat);
        System.out.printf("%f\n", myMinDouble);
        System.out.printf("%f\n", myMaxDouble);

    }
}
