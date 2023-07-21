public class Main {
    public static void main(String[] args) {
        Kreis kreis = new Kreis(2.5);
        Quadrat quadrat = new Quadrat(3);
        Rechteck rechteck = new Rechteck(1.9, 2.1);

        ausgabeBerechnungen(kreis);
//        ausgabeBerechnungen(quadrat);
//        ausgabeBerechnungen(rechteck);
    }

    private static void ausgabeBerechnungen(Kreis kreis) {
        System.out.println("Fläche vom Kreis: " + kreis.berechneFläche());
        System.out.println("Umfang vom Kreis: " + kreis.berechneUmfang());
    }
}
