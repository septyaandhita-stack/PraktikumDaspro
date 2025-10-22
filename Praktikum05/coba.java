import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buah;
        String hargaBuah;

        System.out.print("Masukkan jenis buah : ");
        buah = sc.nextLine();

        switch (buah.toLowerCase()) {
            case "jeruk":
                hargaBuah = "Harga per kg Rp 15.000";
            case "apel":
                hargaBuah = "Harga per kg Rp 10.000";
                break;
            case "anggur":
                hargaBuah = "Harga per kg Rp 20.000";
                break;
            default:
                hargaBuah = "diskon Rp 5.000";
        }
        System.out.println(buah+ " : "+ hargaBuah);

    }

}
