//https://hyperskill.org/learn/step/2218

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        int hourA = scanner.nextInt();
        int minA = scanner.nextInt();
        int secA = scanner.nextInt();
		
        int hourB = scanner.nextInt();
        int minB = scanner.nextInt();
        int secB = scanner.nextInt();

        int result = secB +(minB * 60 + hourB * 3600) - (secA + (minA * 60 + hourA * 3600));
        System.out.println(result);
    }
}