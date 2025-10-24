import java.util.Scanner;
public class modifikasiMobil3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int BiayaSewaMobil = 300000;
        int BiayaSupir = 200000;
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
        TotalBayar = TotalBiayaSewa;

        // batasan lama sewa
        if (LamaSewa > 30) {
            pesan = "Lama sewa tidak boleh lebih dari 30 hari"; 
            System.out.println(pesan);
            return;
        } else {
            pesan = "Lama sewa diterima";
           
        }

        System.out.println("Total biaya sewa mobil:" + BiayaSewaMobil);
        System.out.println("Biaya supir:" + BiayaSupir);
        System.out.println("Biaya bahan bakar:" + BiayaBahanBakar);
        System.out.println("Total biaya sewa:" + TotalBiayaSewa);
        System.out.println("Total bayar = " + TotalBayar);
    }
}