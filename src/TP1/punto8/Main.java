package TP1.punto8;

public class Main {
    public static void main(String[] args) {

        Manager manag1 = new Manager("Lucia", 40, 450000, "Ventas");
        manag1.organiceActivities();
        System.out.println("Nombre del gerente: " + manag1.getName());
        System.out.println("Edad del gerente: " + manag1.getAge());
        System.out.println("Salario del gerente: " + manag1.getSalary());
        System.out.println("Departamento del gerente: " + manag1.getDepartment());
        System.out.println();

        // Crear un trabajador
        Worker worker1 = new Worker("María", 25, 310000, "Producción");
        worker1.producir();
        System.out.println("Nombre del trabajador: " + worker1.getName());
        System.out.println("Edad del trabajador: " + worker1.getAge());
        System.out.println("Salario del trabajador: " + worker1.getSalary());
        System.out.println("Área del trabajador: " + worker1.getArea());
    }
}
