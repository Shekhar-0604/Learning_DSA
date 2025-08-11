import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        PrintArray(arr);
        sc.close();
    }
    public static void PrintArray(int[] arr){
        //int n = arr.length;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
