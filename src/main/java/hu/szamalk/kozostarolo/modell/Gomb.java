package hu.szamalk.kozostarolo.modell;

public class Gomb extends AbstractIdom {
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    public double terfogat(){
        return (((this.sugar*this.sugar*this.sugar)*4)*Math.PI)/3;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "<|=== Gomb{" +
                "sugar=" + sugar +
                '}';
    }
}
