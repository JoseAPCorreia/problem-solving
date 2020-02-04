//https://hyperskill.org/learn/step/2230

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        int seqNumber;
        int num = 0;
		
        do{
            seqNumber = input.nextInt();
            if(seqNumber > num){
                num = seqNumber;
            }
        }while(seqNumber != 0);
        System.out.println(num);
    }
}