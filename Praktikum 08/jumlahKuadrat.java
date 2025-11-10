import java.util.Scanner;

public class jumlahKuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahKuadrat;

        for (int n = 1; n <= 5; n++) {
            jumlahKuadrat = 0;
            System.out.print("n = " + n + " -> jumlah kuadrat = ");

            for (int i = 1; i <= n; i++) {
                jumlahKuadrat += i * i;
                System.out.print(i * i);
                if (i < n)
                    System.out.print(" + ");
            }

            System.out.println(" = " + jumlahKuadrat);
        }

    }

}
