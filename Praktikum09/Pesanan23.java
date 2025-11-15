package Praktikum09;
import java.util.Scanner;

public class Pesanan23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};

        int[] daftarPesanan = new int[daftarMenu.length];

        while (true) {
            System.out.print("Masukkan jumlah pesanan (0 untuk keluar): ");
            int jumlah = sc.nextInt();
            sc.nextLine();

            if (jumlah == 0) 
            break;

            for (int i = 1; i <= jumlah; i++) {
                System.out.print("Masukkan menu " + i + ": ");
                String menu = sc.nextLine();

                System.out.print("Masukkan jumlah item: ");
                int qty = sc.nextInt();
                sc.nextLine();

                // Linear search menu
                int index = -1;
                for (int j = 0; j < daftarMenu.length; j++) {
                    if (daftarMenu[j].equalsIgnoreCase(menu)) {
                        index = j;
                        break;
                    }
                }

                if (index == -1) {
                    System.out.println("Menu tidak tersedia!");
                } else {
                    daftarPesanan[index] += qty;
                }
            }

            double total = 0;
            for (int i = 0; i < daftarMenu.length; i++) {
                total += daftarPesanan[i] * daftarHarga[i];
            }

            System.out.println("Total: " + total);
        }

    }
}
