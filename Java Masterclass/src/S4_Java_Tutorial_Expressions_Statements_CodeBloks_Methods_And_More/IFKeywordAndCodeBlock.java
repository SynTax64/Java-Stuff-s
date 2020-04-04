package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class IFKeywordAndCodeBlock {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = 0;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score is less than 5000 and greater than 1000");
//        } else if (score <= 1000) {
//            System.out.println("Your score is less or equal than 1000");
//        } else {
//            System.out.println("Your score is greater 5000");
//        }

        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
//        int savedFinalScore = finalScore;
//
//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//        int newFinalScore = 0;

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = 0;


        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }
    }
}
