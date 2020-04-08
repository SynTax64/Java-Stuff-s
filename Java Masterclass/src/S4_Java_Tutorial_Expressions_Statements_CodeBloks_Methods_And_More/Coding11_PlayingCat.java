package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class Coding11_PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (((summer == false) && (temperature >= 25 && temperature <= 35)) || ((summer == true) && (temperature >= 25 && temperature <= 45))) {
            return true;
        }
        return false;
    }
}
