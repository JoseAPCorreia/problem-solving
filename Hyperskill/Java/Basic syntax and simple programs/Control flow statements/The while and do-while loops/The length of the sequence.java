//https://hyperskill.org/learn/step/2225

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        int sequence = 0;
		
        while(scanner.nextInt() != 0){
            sequence++;
        }
        System.out.println(sequence);
    }
}
