package PARCIAL1;

public class Sede {
    private int fase;
    private String date;
    private String hour;

    public Sede(int fase, String date, String hour) {
        this.fase = fase;
        this.date = date;
        this.hour = hour;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
