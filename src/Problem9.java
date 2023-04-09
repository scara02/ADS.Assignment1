import java.util.Scanner;

public class Problem9 {

    public static int calcBinomCoeff(int n, int k) {
        if (k > n)
            return 0;

        if (k == 0 || k == n)
            return 1;

        return calcBinomCoeff(n - 1, k - 1) + calcBinomCoeff(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(calcBinomCoeff(n, k));
    }
}
