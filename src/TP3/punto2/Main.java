package TP3.punto2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Marcos");
        Employee employee2 = new Employee("Lucia");

        employee2.assignSupervisor(employee1);

        System.out.println("The supervisor of " + employee1.getName() + " is: " + employee1.getSupervisorName());
    }
}
