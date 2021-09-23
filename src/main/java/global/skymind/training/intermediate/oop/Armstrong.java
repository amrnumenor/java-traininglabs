package global.skymind.training.intermediate.oop;

public class Armstrong {
    private static boolean armstrong(int n) {
        int sum = 0;
        int digit = Integer.toString(n).length();
        int temp = n;
        while(temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digit);
            temp /= 10;
        }
        // debugging purpose
        System.err.println("Sum is: " + sum);
        System.err.println("Num is: " + n);
        return sum == n;
    }
    public static void main(String[] args) {
        // armstrong num: [153, 371, 1634, 8208]
        // armweak num: [111, 1111]
        System.out.println(armstrong(370));
    }
}
