package S6_Inheritance_Constructors_Classes;

public class Coding18_Calculator {
    private double firstNumber = 0;
    private double secondNumber = 0;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return secondNumber - firstNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0.0) {
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }

    public static void main(String[] args) {
        Coding18_Calculator cc = new Coding18_Calculator();
        cc.setFirstNumber(1.25);
        cc.setSecondNumber(0.0);
        cc.getDivisionResult();

        System.out.println(Double.doubleToLongBits(0.0));
        System.out.println(Double.doubleToLongBits(0.000000000000001));
        System.out.println(Double.doubleToLongBits(0.00000000000001));
        System.out.println(Double.doubleToLongBits(0.0000000000001));
        System.out.println(Double.doubleToLongBits(0.000000000001));
        System.out.println(Double.doubleToLongBits(0.00000000001));

        System.out.println(Double.doubleToRawLongBits(0.000000000000001));

    }
}
