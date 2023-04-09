import java.util.Scanner;

public class Problem1 {

    public static int findMinNum(int[] arr, int n) {
        if (n == 1)
            return arr[n - 1];

        return Math.min(arr[n - 1], findMinNum(arr, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMinNum(arr, n));
    }
}