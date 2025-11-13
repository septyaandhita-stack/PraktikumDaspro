import java.util.Scanner; // Sekarang diperlukan karena digunakan

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran array: ");
        int SIZE = scanner.nextInt();

        int[] array1 = new int[SIZE];
        System.out.println("Masukkan elemen array1:");
        for (int i = 0; i < SIZE; i++) {
            array1[i] = scanner.nextInt();
        }

        int[] array2 = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array2[i] = array1[i];
        }

        System.out.println("Array1 length: " + array1.length);
        System.out.println("Array2 length: " + array2.length);

        scanner.close(); // Selalu tutup Scanner untuk menghindari memory leak
    }
}
