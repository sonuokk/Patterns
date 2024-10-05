import java.util.Scanner;
//left opposite pyramid of stars
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:  ");
        int n=sc.nextInt();
        // System.out.print("Enter the value of m:  ");
        // int m=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                 System.out.print("* ");               
            }
            System.out.println();
        }
    }
}
