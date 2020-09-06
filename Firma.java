import jdk.jshell.PersistentSnippet;

public class Firma {
    public static void main(String[] args) {
        /*Employee employee = new Employee();

        employee.getSalary();*/
        Person employee = new Employee();
        employee = (Employee) employee;

    }
}
