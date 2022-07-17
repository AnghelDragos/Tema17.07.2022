package p1;

public class Student {
    private String nume;
    private String facultate;
    private double medieAdmitere;

    public Student(String nume, String facultate, double medieAdmitere){

        if(nume.length()<3){
            System.out.println("Numele facultatii trebuie sa fie mai lung de 3 litere");
            this.nume="numeDefaultPentruFacultate";
        }
        else{
            this.nume=nume;
        }

        this.facultate=facultate;
        if (medieAdmitere > 0 && medieAdmitere <= 10) {
            this.medieAdmitere = medieAdmitere;
        } else {
            System.out.println("Media de admitere introdusa este invalida");
            medieAdmitere=1;
            }
        }

    public String getUserName(){
        return nume;
    }

//    public void setFacultate(String facultate){
//        this.facultate=facultate;
//    }
    public String getFaculate(){
        return facultate;
    }



//    public void setMedieAdmitere(double medieAdmitere) {
//        if (medieAdmitere > 0 && medieAdmitere <= 10) {
//            this.medieAdmitere = medieAdmitere;
//        } else {
//            System.out.println("Media de admitere introdusa este invalida");
//        }
//    }

    public double getMedieAdmitere(){
        return medieAdmitere;
    }


}
