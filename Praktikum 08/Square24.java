import java.util.Scanner;

public class Square24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Masukkan nilai n: ");
        for (int iOuter=1; iOuter<=n; iOuter++) {
            for (int i = 0; i <= n; i++) {
                System.out.print("*");
        }
        System.out.println();
        }
    }
}