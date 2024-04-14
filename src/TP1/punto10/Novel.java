package TP1.punto10;

public class Novel extends Book{
    private String tipo;

    public Novel(String title, String writer, String tipo) {
        super(title, writer);
        this.tipo = tipo;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("Tipo: " + tipo);
    }
}
