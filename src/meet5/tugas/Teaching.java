package meet5.tugas;

public class Teaching {
    private Lecturer lecturer;
    private Course course;

    public Teaching(Lecturer lecturer, Course course) {
        this.lecturer = lecturer;
        this.course = course;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teaching[" +
                "lecturer=" + lecturer.getName() +
                ",course=" + course.getName() +
                ",hour=" + course.getHours() +
                ']';
    }
}
