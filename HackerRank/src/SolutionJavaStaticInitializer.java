import java.util.Scanner;

class SolutionJavaStaticInitializer {

    static boolean flag = false;
    static int B = 0;
    static int H = 0;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        if (B <= 0 || H <= 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        } else {
            flag = true;
        }
    }


    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }

}