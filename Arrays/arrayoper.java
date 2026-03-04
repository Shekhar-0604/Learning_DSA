import java.util.Scanner;

public class arrayoper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the elements of the array");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter the Element to Search");
        // int search = sc.nextInt();

        // // operaions on array
        // int ans = LearnSeraching(arr, search);
        // System.out.println(ans);

        int[] arr1 = new int[5];
        arr1[0] = 2;
        arr1[1] = 7;
        arr1[2] = 10;

        boolean ans = InsertinArray(arr1, 5, 5, 3);

        System.out.println(ans);
        printArray(arr1);

        sc.close();
    }

    public static boolean InsertinArray(int[] arr, int n, int x, int pos) {
        // if (arr.length == n)
        // return false;
        for (int i = n - 1; i > pos - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = x;
        return true;
    }

    // Method to search Element in Array
    public static int LearnSeraching(int[] arr, int k) {
        for (int x : arr) {
            if (x == k)
                return x;
        }
        return -1;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
