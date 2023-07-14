package az.coders.lesson2;

public class Employee {

    /**
    Singleton design pattern
     */
    private static Employee employee;

    public static Employee getInstance() {
        if (employee == null) {
            employee = new Employee();
        }
        return employee;
    }
}
