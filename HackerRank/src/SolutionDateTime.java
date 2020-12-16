import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

class ResultDateTime {

    public static String findDay(int month, int day, int year) {
        LocalDate lDate = LocalDate.of(year, month, day);
        String dayOfWeek = lDate.getDayOfWeek().toString();
        System.out.println(dayOfWeek);
        return dayOfWeek;
    }
}

public class SolutionDateTime {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] strDate = scanner.nextLine().split(" ");
        int[] arrDate = new int[strDate.length];
        for (int i = 0; i < arrDate.length; i++) {
            arrDate[i] = Integer.parseInt(strDate[i]);
        }
        System.out.println(ResultDateTime.findDay(arrDate[0], arrDate[1], arrDate[2]));
    }
}