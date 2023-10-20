package meet5.tugas;

public class Administrative_Employee extends Employee{
    private double attendance_count;

    public Administrative_Employee(String SSN, String name, String email, double attendance_count) {
        super(SSN, name, email);
        this.attendance_count = attendance_count;
    }

    @Override
    public double getAttendance() {
        return attendance_count/25 * 100;
    }

    public void attend(){
        attendance_count++;
    }

    @Override
    public String toString() {
        return "Administrative_Employee[" + super.toString() +
                ", attendance=" + getAttendance() + '%' +
                ']';
    }
}
