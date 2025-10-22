import java.util.Scanner;

public class BilanganMakMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        int Maksimum, Minimum;

        System.out.print("Masukkan bilangan A : ");
        A = sc.nextInt();
        System.out.print("Masukkan bilangan B : ");
        B = sc.nextInt();
        System.out.print("Masukkan bilangan C : ");
        C = sc.nextInt();

        if (A > B) {
            if (B > C) {
                Maksimum = A; 
            } else {
                Maksimum = B;
            }
        } else {
            if (B > C) {
                Maksimum = B;
            } else {
                Maksimum = C;
            }
        }

        // Minimum
        if (A < B) {
            if (B < C) {
                Minimum = A;
            } else {
                Minimum = B;
            }
        } else {
            if (B < C) {
                Minimum = B;
            } else {
                Minimum = C;
            }
        }

        // Maksimum operator logika &&
        if ((A >= B) && (B >= C)) {
            Maksimum = A;
        } else if ((A >= B) && (B >= C)) {
            Maksimum = B;
        } else {
            Maksimum = C;
        }

        // Minimum operator logika &&
        if ((A <= B) && (B <= C)) {
            Minimum = A;
        } else if ((A <= B) && (B <= C)) {
            Minimum = B;
        } else {
            Minimum = C;
        }

        System.out.println("Maksimum = " + Maksimum);
        System.out.println("Minimum = " + Minimum);
    }
}
