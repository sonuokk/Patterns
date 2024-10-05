import java.util.Scanner;
//left pyramid of number without repeating them but opposite pyramid
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:  ");
        int num=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){

                System.out.print(num+"   ");
                num++;
            }
            System.out.println();
        }
    }
}
