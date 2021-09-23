package global.skymind.training.fundamental.ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex13_Fibonacci {
    public static void main(String[] args) {
        ArrayList<Integer> fib = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        fib.add(0);
        fib.add(1);
        int n = sc.nextInt();
        int i = fib.size();
        while(i < n) {
            int a = fib.get(i - 1);
            int b = fib.get(i - 2);
            fib.add(a + b);
            ++i;
        }
        System.out.println(fib);
    }
}
