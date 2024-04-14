package TP1.punto10;

public class BookOfText extends Book{
    private String course;

    public BookOfText(String title, String writer, String course) {
        super(title, writer);
        this.course = course;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("Curso: " + course);
    }
}
