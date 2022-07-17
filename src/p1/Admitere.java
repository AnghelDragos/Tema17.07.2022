package p1;

public class Admitere {
    static double ultimaMedie = 6;
    static int locuriTotale = 2;
    static int locuriOcupate;


    public double getterUltimaMedie(){
        return(ultimaMedie);
    }
    public void setterUltimaMedie(double ultimaMedie){
        this.ultimaMedie=ultimaMedie;
    }

    public int getterlocuriTotale(){
        return(locuriTotale);
    }
    public void setterLocuriTotale(int locuriTotale){
        this.locuriTotale=locuriTotale;
    }

    public int getterlocuriOcupate(){
        return(locuriOcupate);
    }
    public void setterLocuriOcupate(int locuriOcupate){
        this.locuriOcupate=locuriOcupate;
    }

    public static boolean acceptaStudent(Student student){
        if(locuriOcupate==locuriTotale){
            System.out.println("Nu se mai pot accepta studenti. Toate locurile sunt ocupate");
            return false;
        }
        else if(student.getMedieAdmitere()>ultimaMedie){
            System.out.println("Studentul " + student.getUserName() + " a fost admis");
            locuriOcupate++;
            return true;
        }
        else{
            System.out.println("Studentul " + student.getUserName() + " nu a fost admis");
            return false;
        }
    }


}
