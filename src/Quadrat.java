public class Quadrat extends Grundform {
    private double seitenlänge;

    public Quadrat(double seitenlänge) {
        super("Quadrat");
        this.seitenlänge = seitenlänge;
    }

    public double berechneFläche() {
        return seitenlänge * seitenlänge;
    }

    public double berechneUmfang() {
        return 4 * seitenlänge;
    }
}
