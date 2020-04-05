package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class Methods {

    public static void main(String[] args) {
        boolean gameOver = true;
        int levelCOmpleted = 5;
        int score = 800;
        int bonus = 100;

        int highScore = CalculateScore(gameOver, levelCOmpleted, score, bonus);
        System.out.println("Final Score : " + highScore);
        gameOver = true;
        levelCOmpleted = 8;
        score = 10000;
        bonus = 200;

        highScore = CalculateScore(gameOver, levelCOmpleted, score, bonus);
        System.out.println("Final Score : " + highScore);

//        int firstHighScore = CalculateScore(true, 8, 1500, 200);
//        int secondHighScore = CalculateScore(true, 8, 900, 200);
//        int thirthHighScore = CalculateScore(true, 8, 400, 200);
//        int fourthHighScore = CalculateScore(true, 8, 50, 200);

        highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("David", highScore);

        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("Jozica", highScore);

        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Nika", highScore);

        highScore = calculateHighScorePosition(50);
        displayHighScorePosition("Eva", highScore);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int highScore) {
//        if (highScore >= 1000) {
//            return 1;
//        } else if (highScore >= 500) {
//            return 2;
//        } else if (highScore > 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;
        if (highScore >= 1000) {
            position = 1;
        } else if (highScore >= 500) {
            position = 2;
        } else if (highScore >= 100) {
            position = 3;
        }

        return position;

    }

    public static int CalculateScore(boolean mGameOver, int mLevelCompleted, int mScore, int mBonus) {
        int finalScore = 0;
        if (mGameOver) {
            finalScore = mScore + (mLevelCompleted * mBonus);
            return finalScore;
        }
        return -1;
    }
}
