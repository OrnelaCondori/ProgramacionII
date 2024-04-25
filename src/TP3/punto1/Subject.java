package TP3.punto1;

public class Subject {
    private int classroom;
    private String hour;
    private String name;

    public Subject(int classroom, String hour, String name) {
        this.classroom = classroom;
        this.hour = hour;
        this.name = name;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
