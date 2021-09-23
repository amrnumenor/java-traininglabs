package global.skymind.training.fundamental.ex16;

import java.util.Locale;
import java.util.Scanner;

public class Ex16_isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        System.out.println(isPalLoop(str));
    }

    public static boolean isPalSB(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    public static boolean isPalLoop(String str) {
        int l = 0;
        int r = str.length() - 1;
        for(int i = l, j = r; i < j; ++i, --j) {
            if(str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }
}
