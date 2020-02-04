//https://hyperskill.org/learn/step/2228

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        int goal = scanner.nextInt();
        int counter = 1;
        int square;

        while((square = counter * counter++) <= goal){
            System.out.println(square);
        }
    }
}