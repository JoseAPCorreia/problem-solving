//https://hyperskill.org/learn/step/2724

import java.util.Scanner;

public class Main {

    public static int extractInt(double d) {
        int value = (int) d ;
        return value;
    }

    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        final double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}