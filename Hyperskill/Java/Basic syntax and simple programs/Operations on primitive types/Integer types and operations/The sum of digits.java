//https://hyperskill.org/learn/step/2216

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int fullNum = scanner.nextInt();

        int ones = fullNum % 10;
        int tens = (fullNum / 10) % 10;
        int hundreds = fullNum / 100;
        
        System.out.println(ones + tens + hundreds);
    }
}