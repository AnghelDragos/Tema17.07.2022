package TipuriDeMemorieInJava;

public class Persoana {

    private String nume;
    int varsta;

    public Persoana() {

    }

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }


    public void afiseazaInformatii() {
        System.out.println("Numele este: " + nume);
        System.out.println("Varsta este: " + varsta);
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

}
