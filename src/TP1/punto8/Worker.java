package TP1.punto8;

public class Worker extends Employee{
    private String area;

    public Worker(String name, int age, double salary, String area) {
        super(name, age, salary);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void producir() {
        System.out.println(getName() + " está produciendo en el área de " + area + ".");
    }
}
