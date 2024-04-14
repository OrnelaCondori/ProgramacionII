package TP1.punto10;


public class BookOfTextUNC extends BookOfText{
    private String facultad;

    public BookOfTextUNC(String title, String writer, String course, String facultad) {
        super(title, writer, course);
        this.facultad = facultad;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("Facultad: " + facultad);
    }
}
