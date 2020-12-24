package S16_LambdaExpressions;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "G43", "A76", "B12", "H73", "A65", "G01", "L43", "Z62", "J93", "g41"
        );
        List<String> list = new ArrayList<>();

        stringList.forEach(s -> {
            if (s.toUpperCase().startsWith("G")) {
                list.add(s);
                System.out.println(s);
            }
        });
        list.sort((String s1, String s2) -> s1.compareTo(s2));
        list.forEach((String s) -> System.out.println(s));

        list.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);
    }
}
