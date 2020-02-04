//https://hyperskill.org/learn/step/2213

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squi = scanner.nextInt();
        int nuts = scanner.nextInt();

        int remainderOfnuts = nuts % squi;

        System.out.println(remainderOfnuts);
    }
}