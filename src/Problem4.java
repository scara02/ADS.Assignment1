import java.util.Scanner;

public class Problem4 {

    public static long calculateFactorial(int n) {
        if (n == 1)
            return 1;

        return n * calculateFactorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(calculateFactorial(n));
    }
}
