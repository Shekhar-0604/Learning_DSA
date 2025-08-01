import java.util.Scanner;
/*
Code to print this Pattern
1
12
123
1234
12345
 */

public class Pattern5 {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printPattern(n);
            sc.close();
    }

    private static void printPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
