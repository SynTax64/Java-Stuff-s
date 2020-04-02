package S3_First_Steps;

public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer min value: " + myMinValue);
        System.out.println("Integer max value: " + myMaxValue);

        System.out.println("Busted max value:" + (myMaxValue + 1));
        byte byteValue = Byte.MAX_VALUE;
        System.out.println((byteValue + 10));

        int myIntValue = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value: " + myMinByteValue);
        System.out.println("Byte max value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value: " + myMinShortValue);
        System.out.println("Short max value: " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value: " + myMinLongValue);
        System.out.println("Long max value: " + myMaxLongValue);

        System.out.println(myMinLongValue + 1);

        long bigLongValue = 2_147_483_647_123L;


    }
}
