package meet5.tugas;

import java.util.Date;

public class Project {
    private String name;
    private Date start;
    private Date end;

    public Project(String name, Date start, Date end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Project[" +
                "name=" + name+
                ",start=" + start.toString().substring(4, 11).replace(' ', '-') +
                start.toString().substring(24, 28).replace(' ', '-') +
                ",end=" + end.toString().substring(4, 11).replace(' ', '-') +
                end.toString().substring(24, 28).replace(' ', '-') +
                ']';
    }
}
