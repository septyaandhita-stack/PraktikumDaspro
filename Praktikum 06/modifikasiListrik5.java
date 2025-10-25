import java.util.Scanner;

public class modifikasiListrik5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaBulanan = 50000;
        int tarifPerKwh = 1500;
        double PPN = 0.1;
        int kWh;
        int biayaPemakaian;
        double totalBiayaListrik;
        double pajak, pesan;

        System.out.print("kWh:");
        kWh = sc.nextInt();
        tarifPerKwh = 1500 * kWh;
        biayaPemakaian = biayaBulanan + tarifPerKwh;
        totalBiayaListrik = biayaPemakaian + PPN;

        // opsi daya
        System.out.print("Masukkan opsi daya (900 / 1300 / 2200 / 3500 / 5500)");
        String opsiDaya = sc.nextLine();
        
        sc.nextLine();

        if (opsiDaya.equalsIgnoreCase("900")) {
            tarifPerKwh = 1300;
        } else if (opsiDaya.equalsIgnoreCase("1300") || opsiDaya.equalsIgnoreCase("2200")) {
            tarifPerKwh = 1500;
        } else if (opsiDaya.equalsIgnoreCase("3500") || opsiDaya.equalsIgnoreCase("5500")) {
            tarifPerKwh = 1700;
        } else {
            System.out.println("Daya tidak tersedia!");
            return;
        }

        System.out.println("tarif per Kwh:" + tarifPerKwh);
        System.out.println("biaya pemakaian:" + kWh + "Kwh");
        System.out.println("PPN:" + PPN);
        System.out.println("total biaya listrik:" + totalBiayaListrik);
    }
}