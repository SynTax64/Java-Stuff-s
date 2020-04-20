package S5_Control_Flow_Statements;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        final int BIG_BAG = 5; // represent 5kg bag of flour
        final int SMALL_BAG = 1; // represent 1kg bag of flour

        int kilosOfBigPack = bigCount * BIG_BAG;
        int kilosOfSmallPack = smallCount * SMALL_BAG;

        int sumOfKilos = kilosOfBigPack + kilosOfSmallPack;

        if (((sumOfKilos) < goal)) {
            return false;
        }
        return false;

    }
}
