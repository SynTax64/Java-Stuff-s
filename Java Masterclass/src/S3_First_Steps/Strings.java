package S3_First_Steps;

public class Strings {
    public static void main(String[] args) {
        String str = "This is a string";
        System.out.println("My string is equal: " + str);

        str = str + ". This is the second added string";
        System.out.println("My string is equal: " + str);
        String str1 = "200.95";
        String str2 = "49.95";
        System.out.println(str1 + str2);

        String lastString = "50";
        int lastInteger = 10;
        lastString = lastString + lastInteger;
        System.out.println(lastString);
    }
}

