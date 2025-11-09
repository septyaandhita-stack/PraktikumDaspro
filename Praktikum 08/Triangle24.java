import java.util.Scanner;
public class Triangle24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;

        System.out.print("Masukkan nilai n = ");
        while (i <= n) {
            int j = 0;

            while (j < i) {
                System.out.print("*");
                j++;
                
            }
            System.out.println();
            i++;

        }
    
    }  
}