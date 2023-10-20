package meet5.tugas;

public abstract class Employee{
    private final String SSN;
    private String name;
    private String email;
    static protected int counter = 0;

    public Employee() {
        SSN = "N/A";
        name = "N/A";
        email = "N/A";
        counter++;
    }

    public Employee(String SSN, String name, String email) {
        this.SSN = SSN;
        this.name = name;
        this.email = email;
        counter++;
    }

    abstract public double getAttendance();

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "ssNo=" + SSN +
                ", name=" + name +
                ", email=" + email +
                ']';
    }
}
