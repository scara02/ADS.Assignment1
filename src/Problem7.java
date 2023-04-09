import java.util.Scanner;

public class Problem7 {

    public static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public static void printAllPermutations(char[] s, int a, int len) {
        if (a == len) {
            System.out.println(s);
        } else {
            for (int i = a; i <= len; i++) {
                swap(s, a, i);
                printAllPermutations(s, a + 1, len);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        printAllPermutations(s.toCharArray(), 0, s.length() - 1);
    }
}