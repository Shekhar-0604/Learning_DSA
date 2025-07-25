import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printPattern(n);
            sc.close();
    }
    /*Code to print this Pattern
        *
        **
        ***
        ****
        *****
     */
    private static void printPattern(int n) {
        for(int i =1;i<=n;i++){
            for(int j=1 ; j<=i; j++){
                System.err.print("*");
            }
            System.err.println();
        }
    }
    
}
