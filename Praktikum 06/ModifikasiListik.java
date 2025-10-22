import java.util.Scanner;

public class ModifikasiListik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("test");
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

        System.out.println("biaya pemakaian:" + biayaPemakaian);

    }
}