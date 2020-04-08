package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class Coding8_AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1;
        }
        return x * y;
    }
}
