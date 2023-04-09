import java.util.Scanner;

public class Problem5 {

    public static int fib(int n) {
        if (n < 2)
            return (n == 0) ? 0 : 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fib(n));
    }
}
