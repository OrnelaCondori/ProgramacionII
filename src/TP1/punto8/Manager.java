package TP1.punto8;

public class Manager extends Employee{
    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void organiceActivities() {
        System.out.println(getName() + " está organizando actividades en el departamento de " + department + ".");
    }
}
