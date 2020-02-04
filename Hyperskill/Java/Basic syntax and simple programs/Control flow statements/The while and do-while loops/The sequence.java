//https://hyperskill.org/learn/step/2226

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        int sequenceSize = input.nextInt();
        
        int sequence = 0;
        int div4 = 0;

        while(sequence < sequenceSize){
            sequence++;
            int num = input.nextInt();
            if(num % 4 == 0 && num > div4){
                div4 = num;
            }
        }
        System.out.println(div4);
    }
}