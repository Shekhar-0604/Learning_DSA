import java.util.Scanner;

public class Patterns {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            //Pattern6(n);
            Pattern7(n);
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
}
