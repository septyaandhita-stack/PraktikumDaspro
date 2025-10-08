import java.util.Scanner; 

public class PraktikTeori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gajiPokok = 3000000;
        int jumlahAnak = 3;
        double tunjanganAnak = 450000;
        double danaPensiun = 0.05;

        System.out.print("Masukan gaji pokok: ");
        gajiPokok = sc.nextDouble();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = sc.nextInt();
        System.out.print("Masukkan tunjangan anak: ");
        tunjanganAnak = sc.nextDouble();
        System.out.print("Masukkan dana pensiun: ");
        danaPensiun = sc.nextDouble();
        tunjanganAnak = tunjanganAnak * jumlahAnak;
        gajiPokok = gajiPokok - tunjanganAnak;
        danaPensiun = gajiPokok * danaPensiun;
        gajiPokok = (gajiPokok - danaPensiun) + tunjanganAnak;
        System.out.println("450.000: ");
        tunjanganAnak = sc.nextDouble();
        System.out.println("M0.05");
        danaPensiun = sc.nextDouble();
        System.out.println("TunjanganAnak: " * jumlahAnak);
    }
}