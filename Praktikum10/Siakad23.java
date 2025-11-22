package Praktikum10;
import java.util.Scanner;
public class Siakad23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input mahasiswa ke-" + (i + 1));
            double totalPeserta = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPeserta += nilai[i][j];
            }
            System.out.println("milai rata-rata: " + totalPeserta/3);
        }
        System.out.println("\n=================================");
        System.out.println("Rata-rata Nilai setiap Mata kuliah:");

        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("mata kuliah " + (j+1) + ": " + totalPerMatkul /4);
        }
    }
    
}
