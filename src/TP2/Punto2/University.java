package TP2.Punto2;

public class University extends Book{
    private String subject;

    public University(String title, String author, int yearPublic, boolean lend, String subject) {
        super(title, author, yearPublic, lend);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
