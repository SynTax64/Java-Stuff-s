package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("David", 1000);
        System.out.println("New score: " + newScore);
        calculateScore(3000);
//        calculateScore(100, 100);
        calculateScore();
    }

    public static int calculateScore() {
        System.out.println("No player name no player score");
        return 0;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player name " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
}
