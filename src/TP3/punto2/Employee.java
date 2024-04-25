package TP3.punto2;

public class Employee {
    private String name;
    private Employee supervisor;

    public Employee(String name) {
        this.name = name;
    }

    public void assignSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisorName() {
        if (supervisor != null) {
            return supervisor.getName();
        } else {
            return "No supervisor";
        }
    }

    public String getName() {
        return name;
    }
}
