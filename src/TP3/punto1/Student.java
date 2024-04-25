package TP3.punto1;

public class Student extends Person{
    private Group group;
    public Student(int dni, String name) {
        super(dni, name);
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
