//https://hyperskill.org/learn/step/2743

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int div = scanner.nextInt();
		
        int divByN = 0;

        for(int i = start; i <= end; i++){
            if(i % div == 0){
                divByN++;
            }
        }
        System.out.println(divByN);
    }
}