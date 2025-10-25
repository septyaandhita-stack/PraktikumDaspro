import java.util.Scanner;

public class modifikasiDanaPolinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaPublikasi = 300000;
        int biayaDekorasi = 500000;
        int biayaKonsumsiPanitia = 500000;
        int biayaHadiah = 4000000;
        int biayaOperasional = 500000;
        int biayaKonsumsiPeserta = 25000;
        int biayaHonorarium = 75000;
        int jumlahPeserta = 3;
        int biayaPendaftaran = 50000;
        double danaPolinema = 0;
        int jumlahTim;
        int danaAnggaran;
        double totalDanaSponsorship;

        System.out.print("Masukkan jumlah tim: ");
        jumlahTim = sc.nextInt();

        jumlahPeserta = 3 * jumlahTim;
        biayaKonsumsiPeserta = 25000 * jumlahPeserta;
        biayaHonorarium = 75000 * jumlahTim;
        danaAnggaran = biayaPublikasi + biayaDekorasi + biayaKonsumsiPeserta + biayaHadiah + biayaOperasional
                + biayaKonsumsiPanitia + biayaHonorarium;
        biayaPendaftaran = 50000 * jumlahTim;

        System.out.print("Apakah Polinema bersedia memberikan dana bantuan? (Ya/Tidak) :");
        String jawab = sc.next();

        double persentaseBantuanPolinema = 0;

        if (jawab.equalsIgnoreCase("Ya")) {
            System.out.print("Masukkan persentase dana bantuan dari Polinema: ");
            persentaseBantuanPolinema = sc.nextDouble();
        }
        
        danaPolinema = (persentaseBantuanPolinema / 100) * danaAnggaran;
        totalDanaSponsorship = (danaAnggaran - danaPolinema - biayaPendaftaran);

        System.out.println("jumlah peserta\t:" + jumlahPeserta);
        System.out.println("biaya konsumsi peserta\t:" + biayaKonsumsiPeserta);
        System.out.println("biaya honorarium\t:" + biayaHonorarium);
        System.out.println("jumlah dana anggaran:" + danaAnggaran);
        System.out.println("dana polinema (" + persentaseBantuanPolinema + "%) : " + danaPolinema);
        System.out.println("jumlah biaya pendaftaran:" + biayaPendaftaran);
        System.out.println("total dana sponsorship:" + totalDanaSponsorship);

    }
}