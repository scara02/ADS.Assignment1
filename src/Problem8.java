import java.util.Scanner;

public class Problem8 {

    public static boolean isOnlyDigits(String s) {
        if (s.length() == 1)
            return Character.isDigit(s.charAt(0));

        return Character.isDigit(s.charAt(0)) && isOnlyDigits(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println((isOnlyDigits(s)) ? "Yes" : "No");
    }

}
