package TP2.Punto2;

public class Childish extends Book{
    private String theme;

    public Childish(String title, String author, int yearPublic, boolean lend, String theme) {
        super(title, author, yearPublic, lend);
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

}
