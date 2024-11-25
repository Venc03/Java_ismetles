package hu.szamalk.kozostarolo.modell;

public abstract class AbstractFaIdom extends AbstractIdom {
    private static double fajsuly = 0.8;

    public abstract double terfogat();

    public double suly(){
        return terfogat() * AbstractFaIdom.fajsuly;
    }

    @Override
    public String toString() {
        return "FaIdom{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}
