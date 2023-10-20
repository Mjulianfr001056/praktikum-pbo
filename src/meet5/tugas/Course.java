package meet5.tugas;

public class Course {
    private String name;
    private String id;
    private float hours;

    public Course(String name, String id, float hours) {
        this.name = name;
        this.id = id;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public float getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Course[" +
                "name=" + name +
                ",id=" + id +
                ",hours=" + hours +
                ']';
    }
}
