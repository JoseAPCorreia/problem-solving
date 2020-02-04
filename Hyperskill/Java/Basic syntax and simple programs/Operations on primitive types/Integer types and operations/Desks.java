//https://hyperskill.org/learn/step/2220

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        int chairs1 = class1 / 2 + class1 % 2;
        int chairs2 = class2 / 2 + class2 % 2;
        int chairs3 = class3 / 2 + class3 % 2;

         System.out.println(chairs1 + chairs2 + chairs3);

        }
    }