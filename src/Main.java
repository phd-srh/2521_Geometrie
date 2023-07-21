public class Main {
    public static void main(String[] args) {
        Kreis kreis = new Kreis(2.5);
        Quadrat quadrat = new Quadrat(3);
        Rechteck rechteck = new Rechteck(1.9, 2.1);

        ausgabeBerechnungen(kreis);
        ausgabeBerechnungen(quadrat);
        ausgabeBerechnungen(rechteck);
    }

    private static void ausgabeBerechnungen(Grundform form) {
        //String formTyp = "Kreis"; // können wir das irgendwie rausfinden?
        String formTyp = form.getFormTyp(); // die umständliche aber funktionierende Version
//        String formTyp = form.getClass().getName(); // elegant, aber noch unbekannt
        System.out.println("Fläche vom " + formTyp + ": " + form.berechneFläche());
        System.out.println("Umfang vom " + formTyp + ": " + form.berechneUmfang());
    }
}
