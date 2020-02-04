//https://hyperskill.org/learn/step/2234

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
		
        while(input > 1){
            System.out.print(input + " ");
			
            if(input % 2 == 0){
                input = input / 2;
            }
            else{
                input *= 3;
                input++;
               }
        }
        System.out.println(input);
    }
}