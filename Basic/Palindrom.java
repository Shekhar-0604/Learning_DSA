import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean res = isPalinArray(arr);
        System.out.println(res);
        sc.close();
    }

    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int res = n;
            int pa = 0;
            while (res > 0) {
                pa = 10 * pa + res % 10;
                res = res / 10;
            }
            if (pa != n) {
                return false;
            }
        }
        return true;
    }
}
