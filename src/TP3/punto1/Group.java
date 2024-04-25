package TP3.punto1;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String schoolYear;
    private char letter;
    private List<Student> Students;
    private List<Subject> Subjects;

    public Group(String schoolYear, char letter) {
        this.schoolYear = schoolYear;
        this.letter = letter;
        Students= new ArrayList<>();
        Subjects= new ArrayList<>();
    }

    public void addStudent(Student student){
        Students.add(student);
        student.setGroup(this);
    }
    public List<Student> getStudents(){
        return Students;
    }

    public void addSubject(Subject subject){
        Subjects.add(subject);
    }
    public List<Subject> getSubjectss(){
        return Subjects;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
}
