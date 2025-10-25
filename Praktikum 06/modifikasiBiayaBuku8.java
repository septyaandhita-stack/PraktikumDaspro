import java.util.Scanner;

public class modifikasiBiayaBuku8 {
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

        System.out.print("Masukkan jumlah halaman: ");
        jumlahHalaman = sc.nextInt();

        sc.nextLine();

        System.out.print("Masukkan jenis cover (hardCover / softCover):");
        String jenisCover = sc.nextLine();

        int biayaCover = 0;
        double berat = 0;

        if (jenisCover.equalsIgnoreCase("hardCover")) {
            biayaCover = 20000;
            berat = 0.250;
        } else if (jenisCover.equalsIgnoreCase("softCover")) {
            biayaCover = 10000;
            berat = 0.100;
        } else {
            System.out.println("Jenis cover tidak tersedia!");
            return;
        }

        jumlahLembar = (int) Math.ceil(jumlahHalaman / 2.0);
        biayaCetak = jumlahHalaman * biayaHalaman;
        beratTotal = (jumlahLembar * beratPerLembar) + berat + beratPacking;
        biayaKirim = (int) Math.ceil(beratTotal) * biayaPengiriman;
        totalBayar = biayaCetak + biayaCover + biayaKirim;

        System.out.println("jumlah halaman:" + jumlahHalaman);
        System.out.println("jenis cover:" + jenisCover);
        System.out.println("jumlah lembar:" + jumlahLembar);
        System.out.println("biaya cetak:" + biayaCetak);
        System.out.println("berat total:" + beratTotal);
        System.out.println("biaya kirim:" + biayaKirim);
        System.out.println("total bayar:" + totalBayar);

    }
}
