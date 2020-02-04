//https://hyperskill.org/learn/step/2274

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean first = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean second = num2 > 0 && num1 <= 0 && num3 <= 0;
        boolean third = num3 > 0 && num1 <= 0 && num2 <= 0;

        System.out.println(first || second || third);
    }
}