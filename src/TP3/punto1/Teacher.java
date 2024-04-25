package TP3.punto1;
import java.util.List;
import java.util.ArrayList;

public class Teacher extends Person{
    private String departamento;
    //Un profesor puede dar varias materias
    List<Subject> Subjects;
    public Teacher(int dni, String name, String departamento) {
        super(dni, name);
        this.departamento = departamento;
        Subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject){
        Subjects.add(subject);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
