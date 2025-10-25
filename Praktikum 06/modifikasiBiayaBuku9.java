import java.util.Scanner;

public class modifikasiBiayaBuku9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaHalaman = 200;
        double beratPerLembar = 0.003;
        double beratHardCover = 0.250;
        double beratPacking = 0.300;
        int biayaPengiriman = 15000;
        int biayaCetak;
        int biayaKirim;
        double beratTotal;
        int jumlahHalaman;
        int jumlahLembar;
        int totalBayar;
        int berat;
        int jenisCover;

        System.out.print("Masukkan jumlah halaman: ");
        jumlahHalaman = sc.nextInt();

        sc.nextLine();

        System.out.print("Masukkan kota pelanggan (Malang / Batu):");
        String kotaPelanggan = sc.nextLine();

        int biayaCover = 20000;

        jumlahLembar = (int) Math.ceil(jumlahHalaman / 2.0);
        biayaCetak = jumlahHalaman * biayaHalaman;
        beratTotal = (jumlahLembar * beratPerLembar) + beratHardCover + beratPacking;

        if (kotaPelanggan.equalsIgnoreCase("Malang") || kotaPelanggan.equalsIgnoreCase("Batu")) {
            biayaKirim = 20000;
        } else {
            biayaKirim = (int ) Math.ceil(beratTotal) * biayaPengiriman;
        }

        totalBayar = biayaCetak + biayaCover + biayaKirim;

        System.out.println("jumlah halaman:" + jumlahHalaman);
        System.out.println("cover : hard cover");
        System.out.println("kota pelanggan:" + kotaPelanggan);
        System.out.println("jumlah lembar:" + jumlahLembar);
        System.out.println("biaya cetak:" + biayaCetak);
        System.out.println("Biaya cover:" + biayaCover);
        System.out.println("berat total:" + beratTotal);
        System.out.println("biaya kirim:" + biayaKirim);
        System.out.println("total bayar:" + totalBayar);

    }
}