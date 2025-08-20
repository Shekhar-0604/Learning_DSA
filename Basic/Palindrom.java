public class Palindrom {
    public static void main(String[] args) {
        int[] arr = { 111, 222, 333, 444, 555 };
        boolean res = isPalinArray(arr);
        System.out.println(res);
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
