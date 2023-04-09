import java.util.Scanner;

public class Problem10 {

    public static int gcd(int b, int r) {
        if (r == 0) {
            return b;
        }

        return gcd(r, b - r * (b / r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(gcd(b, a - b * (a / b)));
    }
}
