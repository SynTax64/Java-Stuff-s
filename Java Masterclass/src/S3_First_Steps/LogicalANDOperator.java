package S3_First_Steps;

public class LogicalANDOperator {
    public static void main(String[] args) {
        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score");
        }

        int secondHighScore = 60;
        if ((topScore > secondHighScore) && (topScore < 100)) {
            System.out.println("Greater than second score and less than 100");
        }
    }
}
