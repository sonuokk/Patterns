import java.util.Scanner;
//left pyramid of numbers but dont repeat the number
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:  ");
        int num=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
