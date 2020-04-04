package S3_First_Steps;

public class LogicalOROperator {
    public static void main(String[] args) {
        int topScore = 100;
        if ((topScore > 90) || (topScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
//        if (newValue = 50) {
//            System.out.println("This is a error");
//        }

        boolean isCar = false;
//        isCar
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("was Car is true");
        }

        int ageOfClient = 19;
        boolean isOverTwenty = (ageOfClient >= 20) ? true : false;
        System.out.println("Is client equal or over 20 Year old? " + isOverTwenty);
    }
}
