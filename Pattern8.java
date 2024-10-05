import java.util.Scanner;
//left opposite pyramid of numbers
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:  ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){

                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
