package TemaOverloading;

public class Main {
    public static void main(String[] args) {
        MathUtils math1 = new MathUtils();
        System.out.println(math1.inmulteste(1,2));
        System.out.println(math1.inmulteste(-4,2));
        System.out.println(math1.inmulteste(5,2,9));
        System.out.println(math1.inmulteste(-1,-2));


    }
}
