import java.util.Scanner;

public class Osszesen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy egész számot!");
        int szam = sc.nextInt();
        osszeg(szam);

    }
    public static void osszeg(int szam) {
        int osszeg = 0;
        for(int i = 1; i <= szam; i++) {
            osszeg += i;
        }
        System.out.println(osszeg);
    }
}
