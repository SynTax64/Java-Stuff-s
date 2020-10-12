package S12_Collections;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "Compile High level Object oriented language");
        languages.put("Python", "Interpreted object oriented high level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners all purposes symbolic instruction code");

        /*System.out.println(languages.get("Algol"));
        System.out.println(languages.get("Java"));*/
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in this map");
        } else {
            languages.put("Java", "is course is about Java");
        }
        System.out.println(languages.get("Java"));

        for (String key : languages.keySet()) {
            System.out.println(key + " key: " + languages.get(key));
        }
    }
}
