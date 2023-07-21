public class Kreis extends Grundform {
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double berechneFläche() {
        return Math.PI * radius * radius;
    }

    public double berechneUmfang() {
        return Math.PI * 2 * radius;
    }
}
