import java.util.Scanner;

/*
 Code to print this pattern
*
**
***
****
*****
****
***
**
*
 */
public class Pattern4 {
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printPattern(n);
            sc.close();
    }
    private static void printPattern(int n) {
        for(int i =0;i<n;i++){
            for(int j=0 ; j<=i; j++){
                System.err.print("*");
            }
            System.err.println();
        }
        for(int i =n-1;i>0;i--){
            for(int j=1 ; j<=i; j++){
                System.err.print("*");
            }
            System.err.println();
        }
    }
}
