public class Employee extends Person {
    int id;
    String job;
    Employee(String firstName, String lastName, int id, String job) {
        super(firstName, lastName);
        this.id = id;
        this.job = job;
    }
    public int getEmployeeId() {
        return id;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + " ("+job+")";
    }
}
