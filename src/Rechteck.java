public class Rechteck extends Grundform {
    private double länge;
    private double breite;

    public Rechteck(double länge, double breite) {
        super("Rechteck");
        this.länge = länge;
        this.breite = breite;
    }

    @Override
    public double berechneFläche() {
        return länge * breite;
    }

    @Override
    public double berechneUmfang() {
        return 2 * (länge + breite);
    }
}
