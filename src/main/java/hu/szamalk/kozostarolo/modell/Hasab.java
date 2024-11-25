package hu.szamalk.kozostarolo.modell;

public class Hasab extends AbstractIdom {
    private double a, b, massage;

    public Hasab(double a, double b, double massage) {
        this.a = a;
        this.b = b;
        this.massage = massage;
    }

    public double terfogat(){
        return 0;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "<|=== Hasab{" +
                "a=" + a +
                ", b=" + b +
                ", massage=" + massage +
                '}';
    }
}
