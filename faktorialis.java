import java.util.Scanner;

public class faktorialis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        int szam = sc.nextInt();
        szamitas(szam);
    }

    public static void szamitas(int szam) {
        int fakt = 1;
        for(int i = 1; i <= szam; i++) {
            fakt = fakt * i;
        }
        System.out.println(fakt);
    }
}
