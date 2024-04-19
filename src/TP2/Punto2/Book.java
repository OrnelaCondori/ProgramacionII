package TP2.Punto2;

public abstract class Book implements Prestable {
    private String title;
    private String author;
    private int yearPublic;
    private boolean lend;

    public Book(String title, String author, int yearPublic, boolean lend) {
        this.title = title;
        this.author = author;
        this.yearPublic = yearPublic;
        this.lend = lend;
    }

    @Override
    public void leadbook() {
        if (lend){
            System.out.println("El libro "+getTitle()+" no esta disponible, ya fue prestado");
        }else{
            System.out.println("El libro "+ getTitle()+" fue prestado");
            setLend(true);
        }
    }

    @Override
    public void returnBook() {
        System.out.println("El libro "+getTitle()+" esta denuevo en la biblioteca");
        setLend(false);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

    public boolean isLend() {
        return lend;
    }

    public void setLend(boolean lend) {
        this.lend = lend;
    }
}
