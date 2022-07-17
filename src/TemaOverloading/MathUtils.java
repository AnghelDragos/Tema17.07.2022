package TemaOverloading;

public class MathUtils {
    public int inmulteste(int a,int b){
        return(a*b);
    }
    public int inmulteste(int a, int b, int c){
        return(a*b*c);
    }

    public double inmulteste (int a, double b){
        return (double)(a*b);
    }

    public double inmulteste (double a, int b){
        return(a*b);
    }


}
