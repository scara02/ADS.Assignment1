import java.util.Scanner;

public class Problem6 {

    public static int calculatePower(int a, int n) {
        if (n == 1) return a;

        return a * calculatePower(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(calculatePower(a, n));
    }
}
