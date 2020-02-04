//https://hyperskill.org/learn/step/2716

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.next().substring(input.nextInt(), input.nextInt() + 1));
    }
}
