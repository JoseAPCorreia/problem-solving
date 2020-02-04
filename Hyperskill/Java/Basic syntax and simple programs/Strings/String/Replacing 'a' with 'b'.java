//https://hyperskill.org/learn/step/2719

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        System.out.println(words.replace('a', 'b'));
    }
}