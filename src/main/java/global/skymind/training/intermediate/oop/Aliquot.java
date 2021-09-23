package global.skymind.training.intermediate.oop;

import java.util.Scanner;

public class Aliquot {
    public static int calc(int num) {
        int sum = 0;
        for(int i = 1, limit = num / 2; i <= limit; ++i) {
            if(num % i == 0)
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        System.out.println(calc(n));
    }
}
