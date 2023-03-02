package CommonFactor;

import java.util.Scanner;

public class CommonFactor {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scanner.nextInt();
        System.out.print("Enter b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                    System.out.println("a = " + a);
                } else {
                    b = b - a;
                    System.out.println("b = " + a);
                }
            }
            System.out.println("Greatest common factor: " + a);
        }
    }
}
