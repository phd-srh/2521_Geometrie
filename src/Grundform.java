public abstract class Grundform {
    private String formTyp;

    public Grundform(String formTyp) {
        this.formTyp = formTyp;
    }

    public String getFormTyp() {
        return formTyp;
    }

    public abstract double berechneFläche();
    public abstract double berechneUmfang();
}
