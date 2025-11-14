package Praktikum09;

import java.util.Scanner;

public class SearchNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();

        int[] arrNilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = -1; 

        for (int i = 0; i < n; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println();

        if (hasil != -1) {
            // Tampilkan indeks +1 sesuai contoh output (nomor mahasiswa)
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai " + key + " tidak ditemukkan dalam array.");
        }

        System.out.println();
    }
}
