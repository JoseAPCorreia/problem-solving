//https://hyperskill.org/learn/step/2187

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        int start = scanner.nextInt();
        int end = scanner.nextInt();
		
        int result = 0;

        for(int i = start; i <= end; i++){
            result += i;
        }
        System.out.println(result);
    }
}