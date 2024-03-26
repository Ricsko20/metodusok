import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nedikfibonacciszam = fibonnaciszamito(n);
        System.out.println("A(z) " + n + ". Fibonacci szám: " + nedikfibonacciszam);
    }

    public static int fibonnaciszamito (int n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else {
            int a = 0;
            int b = 1;
            int res = 0;
            for (int i = 2; i <= n; i++) {
                res = a + b;
                a = b;
                b = res;
            }
            return res;
        }
    }
}
