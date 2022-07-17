package p2;
import p1.*;
import static p1.Admitere.acceptaStudent;

public class Main {
    public static void main(String[] args) {

    Student student1 = new Student("Alin", "Automatica", 9.99);
    acceptaStudent(student1);

    Student student2 = new Student("Mihai", "Electronica", 5.99);
    acceptaStudent(student2);

    Student student3 = new Student("Rares", "Fizica", 6.99);
    acceptaStudent(student3);

    Student student4 = new Student("abc", "abc", 6.99);
    acceptaStudent(student4);


    }
}
