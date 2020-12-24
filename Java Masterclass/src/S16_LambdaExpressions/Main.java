package S16_LambdaExpressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the Runnable");
//            }
//        }).start();
//        new Thread(() -> {
//            System.out.println("Printing from the Runnable");
//            System.out.println("Line 2");
//            System.out.printf("This is line %d\n", 3);
//        }).start();

        Employee john = new Employee("John", 37);
        Employee peter = new Employee("Peter", 57);
        Employee david = new Employee("David", 34);
        Employee tim = new Employee("Tim", 39);
        Employee domen = new Employee("Domen", 21);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(peter);
        employees.add(john);
        employees.add(domen);
        employees.add(david);
        employees.add(tim);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });
//
//        Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName())
//        );
//
//        UpperConcat uc = (s1, s2) -> {
//            String result = s1.toUpperCase() + s2.toUpperCase();
//            return result;
//        };
//
//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//        }
//        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.doSomething();
    }

    public static String doStringStuff(UpperConcat uc, String string1, String string2) {
        return uc.toUpperAndConcat(string1, string2);
    }
}


class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    String toUpperAndConcat(String string1, String string2);
}

class AnotherClass {
    public String doSomething() {
        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expression class name is: " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        System.out.println("The Another class name is: " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");
    }

}