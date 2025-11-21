package Praktikum10;

import java.util.Arrays;
import java.util.Scanner;

public class BioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > penonton.length ||
                        kolom < 1 || kolom > penonton[0].length) {

                        System.out.println("Nomor baris atau kolom tidak tersedia!");
                        System.out.println("Silahkan masukkan kembali.\n");
                        continue;
                    }

                    
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi oleh: " +
                            penonton[baris - 1][kolom - 1]);
                        System.out.println("Silahkan pilih kursi lain!\n");
                        continue;
                    }

                    break; 
                }

                penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data penonton berhasil disimpan.\n");
            }

            else if (menu == 2) {
                System.out.println("=== Daftar Penonton ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("[***] ");
                        } else {
                            System.out.print("[" + penonton[i][j] + "] ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }

            else if (menu == 3) {
                System.out.println("Terima kasih!");
                break;
            }

            else {
                System.out.println("Menu tidak tersedia!\n");
            }
        }
    }
}
