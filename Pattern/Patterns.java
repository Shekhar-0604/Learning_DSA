import java.util.Scanner;

public class Patterns {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            //Pattern6(n);
            //Pattern7(n);
            //Pattern8(n);
            //Pattern9(n);
            Pattern10(n);
            sc.close();
    }
    public static void Pattern6(int n){
        /*
          this method will print this pattern
            1
            22
            333
            4444
            55555
         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){ 
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void Pattern7(int n){
        /*
          this method will print this pattern
            1
            12
            123
            1234
            12345
         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){ 
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern8(int n){
        /*
         Code to PRINT THIS PATTERN
            54321
            4321
            321
            21
            1
         */
        for(int i =5; i>0 ; i--){
            for(int j = i ; j>0 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern9(int n){
        /*
         Code to PRINT THIS PATTERN
            12345
            1234
            123
            12
            1
         */
        for(int i =n; i>=1 ; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern10(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("");
            }
            for(int j = 1 ; j<= 2*i+1 ; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("");
            }
            System.out.println();
        }
    }
}
