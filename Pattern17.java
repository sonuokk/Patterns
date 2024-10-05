
import java.util.Scanner;
////Diamond shape pattern with two different logics 1 logic ic commented 1st uncomment that to run
public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:  ");
        int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print("* ");
        // }
        // for (int j = 2; j <= i; j++) {
        // System.out.print("* ");
        // }

        // System.out.println();
        // }
        // // for (int i = n; i >= 1; i--) {
        // for (int i = n-1; i >= 1; i--) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print("* ");
        // }
        // for (int j = 2; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // or

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.err.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.err.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
