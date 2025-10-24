import java.util.Scanner;

public class ModifikasiMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("test");
        int BiayaSewaMobil = 300000;
        int BiayaSupir = 2000000;
        int BiayaBahanBakar, LamaSewa, JarakTempuh, TotalBiayaSewa;
        double diskon, TotalBayar;

        System.out.print("Masukkan lama sewa : ");
        LamaSewa = sc.nextInt();
        System.out.print("Masukkan jarak tempuh : ");
        JarakTempuh = sc.nextInt();

        sc.nextLine();

        System.out.print("Masukkan jenis bahan bakar (pertalite/pertamax): ");
        String jenisBahanBakar = sc.nextLine();

        if (jenisBahanBakar.equalsIgnoreCase("pertalite")) {
            BiayaBahanBakar = 1000 * JarakTempuh;
            System.out.println("Jumlah biaya bahan bakar Pertalite: " + BiayaBahanBakar);
        } else if (jenisBahanBakar.equalsIgnoreCase("pertamax")) {
            BiayaBahanBakar = 1300 * JarakTempuh;
            System.out.println("Jumlah biaya bahan bakar Pertamax: " + BiayaBahanBakar);

        } else {
            BiayaBahanBakar = 0;
            System.out.println("Jenis bahan bakar tidak tersedia!");
        }

        BiayaSewaMobil = 300000 * LamaSewa;
        BiayaSupir = 200000 * LamaSewa;

        TotalBiayaSewa = BiayaSewaMobil + BiayaSupir + BiayaBahanBakar;
        diskon = TotalBiayaSewa * 0.05;
        TotalBayar = TotalBiayaSewa - diskon;

        System.out.println("Total biaya sewa mobil:" + BiayaSewaMobil);
        System.out.println("Biaya supir:" + BiayaSupir);
        System.out.println("Biaya bahan bakar:" + BiayaBahanBakar);
        System.out.println("Total biaya sewa:" + TotalBiayaSewa);
        System.out.println("Total sebelum diskon : " + TotalBiayaSewa);
        System.out.println("5% = " + diskon);
        System.out.println("Total bayar = " + TotalBayar);
    }
}