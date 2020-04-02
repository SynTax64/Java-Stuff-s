package S3_First_Steps;

public class TypeCasting {
    public static void main(String[] args) {

        int myIntTotal = (Integer.MIN_VALUE / 2);
        byte myByte = Byte.MIN_VALUE;
        byte myByteTotal = (byte) (myByte / 2);
        System.out.println(myIntTotal);

    }
}
