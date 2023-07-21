public class Main {
    public static void main(String[] args) {
        Kreis kreis = new Kreis(2.5);
        Quadrat quadrat = new Quadrat(3);

        System.out.println("Fläche vom Kreis: " + kreis.berechneFläche());
        System.out.println("Umfang vom Kreis: " + kreis.berechneUmfang());
        System.out.println("Fläche vom Quadrat: " + quadrat.berechneFläche());
        System.out.println("Umfang vom Quadrat: " + quadrat.berechneUmfang());
    }
}
