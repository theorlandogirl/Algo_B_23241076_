import java.util.Scanner;

public class Banyakif {
    public static void main(String[] args) {
        //data member
        int nilai;
        String grade;

        //membuat objek scanner
        Scanner scan = new Scanner (System.in);

        //memasukkan imput dari keyboard
        System.out.print("Masukkan Nilai : ");

        //if STATMENT
        if (nilai >=80) {
            grade = "A";
        }else if (nilai >=70 && nilai <=79) {
            grade = "B";
        }else if (nilai >=60 && nilai <=69) {
            grade ="C";
        }else if (nilai >=50 && nilai <=59) {
            grade ="D";
        }else (nilai <=50) {
            grade ="E";
        }

    }

    

}
