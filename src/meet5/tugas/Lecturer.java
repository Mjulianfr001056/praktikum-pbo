package meet5.tugas;

public class Lecturer extends Research_Associate{

    public Lecturer(String SSN, String name, String email, String fieldOfStudy, double realTeachingHour) {
        super(SSN, name, email, fieldOfStudy, realTeachingHour);
    }

    @Override
    public String toString() {
        return "Lecturer[" + super.toString() +
                ",Attendance= " + String.format("%.2f", super.getAttendance()) + '%' +
                "]";
    }
}
