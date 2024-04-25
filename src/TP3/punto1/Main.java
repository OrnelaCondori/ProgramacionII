package TP3.punto1;

public class Main {
    public static void main(String[] args) {
        //Creo los objetos de las clases
        Teacher teacher1 = new Teacher(159847, "Jose", "Matematica");

        Subject subject1 = new Subject(10, "8:00-10:00", "Matemática");
        Subject subject2 = new Subject(6, "11:00-13:00", "Fisica");
        Subject subject3 = new Subject(8, "9:30-11:30", "FisicaII");

        Student student1 = new Student(123456, "Valentina");
        Student student2 = new Student(456789, "Marcos");
        Student student3 = new Student(125698, "Melisa");
        Student student4 = new Student(589632, "Yanina");

        Group group1 = new Group("segundo",'A');
        Group group2 = new Group("primero", 'B');

        //relaciono los objetos
        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student3);
        group2.addStudent(student4);

        group1.addSubject(subject1);
        group1.addSubject(subject2);
        group2.addSubject(subject3);

        teacher1.addSubject(subject1);
        teacher1.addSubject(subject2);
        teacher1.addSubject(subject3);

        // A
        System.out.println("El aula de la tercer asignatura del profesor "+ teacher1.getName()+" es: "+ teacher1.Subjects.get(2).getClassroom());
        //B
        System.out.println("Las asignaturas dadas por el profesorson: ");
        for (Subject subject: teacher1.Subjects){
            System.out.println("- "+subject.getName());
        }
        //C
        System.out.println("Alumnos del grupo que recibe la asignatura " + subject1.getName() + ":");
        for (Student student : group1.getStudents()) {
            System.out.println("- Nombre: " + student.getName() + ", DNI: " + student.getDni());
        }
        //D
        System.out.println("La letra del grupo al que pertenece el alumno " + student3.getName() + " es: " + student3.getGroup().getLetter());
        //E
        System.out.println("Asignaturas recibidas por el primer grupo al que pertenece el alumno " + student1.getName() + ":");
        for (Subject subject : group1.getSubjectss()) {
            System.out.println("- " + subject.getName());
        }
        //F
        String nombreAsignatura = "Matemática"; // simulo que la pedi por pantalla
        for (Subject subject : student2.getGroup().getSubjectss()) {
            if (subject.getName().equals(nombreAsignatura)) {
                System.out.println("El profesor que imparte la asignatura " + nombreAsignatura + " es: " + teacher1.getName());
                break;
            }
        }
    }
}
