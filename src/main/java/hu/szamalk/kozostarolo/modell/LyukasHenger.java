package hu.szamalk.kozostarolo.modell;

public class LyukasHenger extends TomorHenger {

    private double falvast;

    public LyukasHenger(double r, double m, double falvast) {
        super(r, m);
        this.falvast = falvast;
    }

    public LyukasHenger(double r, double m, double fajsuly, double falvast) {
        super(r, m, fajsuly);
        this.falvast = falvast;
    }

    public LyukasHenger(double r, double m) {
        this(r, m, 1);
    }

    public double getFalvast() {
        return falvast;
    }

    @Override
    public double terfogat() {
        double belsoR = getR() - falvast;
        MertaniHenger belsoHenger = new MertaniHenger(belsoR, this.getM());
        MertaniHenger.setHengerDb(-1);
        return super.terfogat() - belsoHenger.terfogat();
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "LyukasHenger{" +
                "falvast=" + falvast +
                '}';
    }
}
