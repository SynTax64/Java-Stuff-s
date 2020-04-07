package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class Challenge_MethodOverloading {
    public static double calcFeetAndInchesToCentimeters(int mFeet, int mInches) {

        if ((mFeet) >= 0 && ((mInches >= 0) && (mInches <= 12))) {

            int feetToInches = mFeet * 12;
            double inchesToCentimeters = (feetToInches + mInches) * 2.54;
            System.out.println(mFeet + " feet, " + mInches + " inches = " + inchesToCentimeters + " cm");
            return inchesToCentimeters;
        }
        System.out.println("Invalid feet or inches parameter");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int mInches) {
        int feetTotal = 0;
        int inchesTotal = 0;
        if (mInches >= 0) {
            if (mInches >= 12) {
                feetTotal = mInches / 12;
                inchesTotal = mInches % 12;
                double centimeters = calcFeetAndInchesToCentimeters(feetTotal, inchesTotal);
                System.out.println(mInches + " inches = " + centimeters);
                return centimeters;
            } else {
                inchesTotal = mInches % 12;
                double centimeters = inchesTotal * 2.54;
                System.out.println(mInches + " inches = " + centimeters);
                return centimeters;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(70);
        calcFeetAndInchesToCentimeters(6, -1);


    }
}
