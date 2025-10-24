import java.util.Scanner;

public class gabunganModifikasiMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int BiayaSewaMobil = 300000;
        int BiayaSupir = 2000000;
        int BiayaBahanBakar = 1000;
        int LamaSewa, JarakTempuh, TotalBiayaSewa;
        double diskon = 0, TotalBayar;
        String pesan;

        // input
        System.out.print("Masukkan lama sewa (hari) : ");
        LamaSewa = sc.nextInt();
        System.out.print("Masukkan jarak tempuh (km) : ");
        JarakTempuh = sc.nextInt();

        sc.nextLine();

        // hitungan
        BiayaSewaMobil = 300000 * LamaSewa;
        BiayaSupir = 200000 * LamaSewa;
        BiayaBahanBakar = BiayaBahanBakar * JarakTempuh;
        TotalBiayaSewa = BiayaSewaMobil + BiayaSupir + BiayaBahanBakar;

        System.out.println("======= Bahan Bakar =======");
        // bahan bakar
        System.out.print("Masukkan jenis bahan bakar (pertalite/pertamax): ");
        String jenisBahanBakar = sc.nextLine();

        if (jenisBahanBakar.equalsIgnoreCase("pertalite")) {
            BiayaBahanBakar = 1000 * JarakTempuh;
            System.out.println("Jumlah biaya bahan bakar Pertalite: " + BiayaBahanBakar);
        } else if (jenisBahanBakar.equalsIgnoreCase("pertamax")) {
            BiayaBahanBakar = 1300 * JarakTempuh;
            System.out.println("Jumlah biaya bahan bakar Pertamax: " + BiayaBahanBakar);
        }
    System.out.println("======= Diskon =======");
        // diskon
        if (TotalBiayaSewa > 2000000) {
            diskon = 0.05 * TotalBiayaSewa;
            System.out.println("Total biaya sewa : " + diskon);
        } else {
            diskon = 0.0 * TotalBiayaSewa;
            System.out.println("Total biaya : " + diskon);
        }

        TotalBayar = TotalBiayaSewa - diskon;

        System.out.println("======= Batasan Sewa =======");
        // batasan sewa
        if (LamaSewa > 30) {
            pesan = "Lama sewa tidak boleh lebih dari 30 hari";
            System.out.println(pesan);
        } else {
            pesan = "Lama sewa diterima";

        }
        System.out.println(pesan);
        System.out.println("Total biaya sewa mobil:" + BiayaSewaMobil);
        System.out.println("Biaya supir:" + BiayaSupir);
        System.out.println("Biaya bahan bakar:" + BiayaBahanBakar);
        System.out.println("Total biaya sewa:" + TotalBiayaSewa);
        System.out.println("Total sebelum diskon : " + TotalBiayaSewa);
        System.out.println("5% = " + diskon);
        System.out.println("Total bayar = " + TotalBayar);
    }

}
