package hu.szamalk.kozostarolo.modell;

public class TomorHenger extends MertaniHenger {

    private double fajsuly;

    public TomorHenger(double r, double m) {
        this(r, m, 1);
    }

    public TomorHenger(double r, double m, double fajsuly) {
        super(r, m);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public void setFajsuly(double fajsuly) {
        this.fajsuly = fajsuly;
    }

    public double suly(){
        return terfogat()*getFajsuly();
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + " Henger{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}
