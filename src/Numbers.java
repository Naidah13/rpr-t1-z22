// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package ba.unsa.etf.rpr.t1;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj n:");
        int n=scanner.nextInt();
        for (int i = 1; i < n; i++) {
            if (DivisibleByDigits(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean DivisibleByDigits(int m) {
        int s = Sumd(m);
        return m % s == 0;
    }

    private static int Sumd (int number) {
        int sum=0;
        while (number>0) {
            sum=sum+number%10;
            number=number/10;
        }
        return sum;
    }
}


