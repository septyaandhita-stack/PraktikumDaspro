import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print(" Masukkan angka : ");
        angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " Genap");
        } else {
            System.out.println("Angka " + angka + " Ganjil");

        }

    }
}
