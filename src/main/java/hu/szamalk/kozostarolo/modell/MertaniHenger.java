package hu.szamalk.kozostarolo.modell;

public class MertaniHenger extends AbstractIdom {
    private static int hengerDb;
    private double r, m;

    public MertaniHenger(double r, double m) {
        MertaniHenger.hengerDb++;
        this.r = r;
        this.m = m;
    }

    public double getR() {
        return r;
    }

    public double getM() {
        return m;
    }

    public static int getHengerDb() {
        return hengerDb;
    }

    public static void setHengerDb(int hengerDb) {
        MertaniHenger.hengerDb = hengerDb;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setM(double m) {
        this.m = m;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "<|=== Mertani{" +
                "hengerDarab=" + hengerDb +
                ", r=" + r +
                ", m=" + m +
                '}';
    }

    public double terfogat(){
        return (Math.pow(r, 2) * Math.PI * m);
    }
}
