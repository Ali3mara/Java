public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ali", "Emara");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());

        Employee employee = new Employee("Ali", "Emara", 2304, "Software Engineer");
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName() + " with ID " + employee.getEmployeeId());
    }
}