package Praktikum09;

import java.util.Scanner;

public class ArrayRataNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double total = 0;
        double rata2;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        double totalLulus = 0, totalTidakLulus = 0;
        int menghitungLulus = 0, menghitungTidakLulus = 0;
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int i = 0; i < jumlahMhs; i++) {

        if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                menghitungLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                menghitungTidakLulus++;
            }
        
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
        
            } 
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }

            }            

        System.out.println("Rata-rata nilai lulus = " + (totalLulus / menghitungLulus));
        System.out.println("Rata-rata nilai tidak lulus = " + (totalTidakLulus / menghitungTidakLulus));
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}
