//https://hyperskill.org/learn/step/5011

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int dec1 = --num1;
        int dec2 = --num2;
        int dec3 = --num3;
        int dec4 = --num4;
		
        System.out.println(dec1 + " " + dec2 + " " + dec3 + " " + dec4);
    }
}
