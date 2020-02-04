//https://hyperskill.org/learn/step/2214

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        int input = scanner.nextInt();
        int tens = (input % 100) / 10;

        System.out.println(tens);
    }
}
