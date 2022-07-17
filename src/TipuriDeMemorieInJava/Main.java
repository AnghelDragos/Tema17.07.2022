package TipuriDeMemorieInJava;

public class Main {
    public static void main(String[] args) {

        Persoana persoana1 = new Persoana("George", 22);
        Persoana persoana2 = new Persoana("Matei", 27);
        Persoana persoana3 = new Persoana();
        persoana3 = persoana1;
        persoana3.varsta = 32;

        persoana1.afiseazaInformatii();
        persoana2.afiseazaInformatii();
        persoana3.afiseazaInformatii();

        int numarOarecare = 8;
        int numarOarecare2 = 54;
        System.out.println(atribuieInversul(numarOarecare));
        System.out.println(atribuieInversul(numarOarecare2));

        System.out.println("varsta persoanei 3 inainte de crestere: " + persoana3.varsta);
        System.out.println("varsta persoanei 1 inainte de crestere: " + persoana1.varsta);
        cresteVarsta(persoana1);
        System.out.println("varsta crescuta a persoanei 1 este: " + persoana1.varsta);
        System.out.println("varsta crescuta a persoanei 3 desi nu am modificat-o direct este: " + persoana3.varsta);

    }

//    public static void cresteVarsta(Persoana persoanaOarecare) {
//        persoanaOarecare.setVarsta(persoanaOarecare.getVarsta() + 1);
//
//    } aici este folosit setter si getter

    public static void cresteVarsta(Persoana persoanaOarecare) {
        persoanaOarecare.varsta = persoanaOarecare.varsta+1;
    }


    public static int atribuieInversul(int nr) {
        return (nr = -nr);
    }


}
