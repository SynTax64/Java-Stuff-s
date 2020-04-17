package S5_Control_Flow_Statements;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        final int BIG_BAG = 5; // represent 5kg bag of flour
        final int SMALL_BAG = 1; // represent 1kg bag of flour
        int resultOfKilos = ((bigCount * BIG_BAG) + (smallCount * SMALL_BAG));

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        return false;

    }
}
