https://hyperskill.org/learn/step/2275

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean firstSum = num1 + num2 == 20;
        boolean secondSum = num1 + num3 == 20;
        boolean thirdSum = num2 + num3 == 20;

        System.out.println(firstSum || secondSum || thirdSum);
    }
}
