import java.util.Scanner;
public class PraktikTeori2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int lebarTanah, panjangTanah, kolamLingkaran, kolamPersegi, luasTanah, luasRumput;
        double jariJari, luasKolam;

        System.out.print("Masukkan lebar tanah: ");
        lebarTanah = sc.nextInt();
        System.out.print("Masukkan panjang tanah: ");
        panjangTanah = sc.nextInt();
        System.out.print("Masukkan kolam lingkaran: ");
        kolamLingkaran = sc.nextInt();
        System.out.print("Masukkan kolam persegi: ");
        kolamPersegi = sc.nextInt();

        luasTanah = panjangTanah * lebarTanah;
        luasKolam = 3.14 * (kolamLingkaran/2.0) * (kolamLingkaran/2.0);
        luasKolam = kolamPersegi * kolamPersegi;
        luasRumput = luasTanah - (kolamLingkaran+ kolamPersegi);

        System.out.println("luas tanah yang akan ditanami rumput: " + luasRumput);
      }
}