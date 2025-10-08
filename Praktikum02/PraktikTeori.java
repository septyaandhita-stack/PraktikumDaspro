import java.util.Scanner; 

public class PraktikTeori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok, jumlahAnak, tunjanganAnak, gajiKotor, gajiBersih;
        double danaPensiun = 0.05;

        System.out.print("\nMasukan gaji pokok: ");
        gajiPokok = sc.nextInt();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = sc.nextInt();
        System.out.print("Masukkan tunjangan anak: ");
        tunjanganAnak = sc.nextInt();

        tunjanganAnak = tunjanganAnak * jumlahAnak;
        danaPensiun = gajiPokok * danaPensiun;
        gajiKotor = gajiPokok + tunjanganAnak;
        gajiBersih = (int) (gajiKotor - danaPensiun);
        System.out.println("Gaji bersih: " + gajiBersih);
    }
}