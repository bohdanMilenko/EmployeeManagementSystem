package Entities;

public class Project {

    private String name;
    private String clientName;
    private Employee projectManager;

    public Project(String name, String clientName, Employee projectManager) {
        this.name = name;
        this.clientName = clientName;
        this.projectManager = projectManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Employee getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(Employee projectManager) {
        this.projectManager = projectManager;
    }
}
