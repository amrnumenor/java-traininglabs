package global.skymind.training.fundamental.ex11;

import java.util.Scanner;

public class Ex11_PyramidNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for(int i = 1; i <= rows; ++i) {
            for(int L = rows - i; L >= 0; --L) System.out.print("  ");
            for(int jL = 1; jL <= i; ++jL) System.out.print(jL + " ");
            for(int jR = i - 1; jR > 0; jR--) System.out.print(jR + " ");
            System.out.println("");
        }
    }
}
