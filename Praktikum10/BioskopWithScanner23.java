package Praktikum10;

import java.util.Arrays;
import java.util.Scanner;

public class BioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            ;
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data penonton berhasil disimpan! ");
            } else if (menu == 2) {
                System.out.println("=== Daftar Penonton ===");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println(Arrays.toString(penonton[i]));
                }
                System.out.println();
            } else if (menu == 3) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Menu tidak tersedia!\n");
            }

        }
    }
}

// System.out.print("Input penonton lainnya? (y/n): ");
// next = sc.nextLine();