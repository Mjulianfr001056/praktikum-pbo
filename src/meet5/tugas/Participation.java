package meet5.tugas;

public class Participation {
    private double hours;
    private Project project;
    private Research_Associate research_associate;

    public Participation(double hours, Project project, Research_Associate research_associate) {
        this.hours = hours;
        this.project = project;
        this.research_associate = research_associate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Research_Associate getResearch_associate() {
        return research_associate;
    }

    public void setResearch_associate(Research_Associate research_associate) {
        this.research_associate = research_associate;
    }

    @Override
    public String toString() {
        return "Participation[" +
                "hours=" + hours +
                ",project=" + project.getName() +
                ",research_associate=" + research_associate.getName() +
                ']';
    }
}
