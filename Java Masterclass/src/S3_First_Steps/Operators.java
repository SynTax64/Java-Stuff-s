package S3_First_Steps;

public class Operators {
    public static void main(String[] args) {

        // int result =((assigment operator) 1(operand) +(operator) 2(operand)(expression));
        int result = 1 + 2; // result(3) of this expression is literal
        System.out.println("Result: " + result);
        int previousResult = result;
        System.out.println("Previous result: " + previousResult);
        result = result - 1;
        System.out.println("New result: " + result);

        result = result * 10;
        System.out.println("New result " + result);

        int abbOperator = 0;
//        int tmpValue = abbOperator++;
        int tmpValue = ++abbOperator;

        abbOperator++;
        abbOperator += 2;
    }
}
