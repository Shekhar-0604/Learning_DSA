import java.util.Scanner;

public class basiclearn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean res = BasicArray(arr);
        System.out.println(res);
        sc.close();
    }

    public static boolean BasicArray(int[] arr) {
        // will think what to code
        return true;
    }
}
