//https://hyperskill.org/learn/step/2194

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int size = scanner.nextInt();
		
        int tooSmallAmmount = 0;
        int tooBigAmmount = 0;
        int perfectAmmount = 0;
        int parts;

        for(int i = 0; i < size; i++){
            parts = scanner.nextInt();
            if(parts == 1){
                tooBigAmmount++;
            }
            else if(parts == -1){
                tooSmallAmmount++;
            }
            else{
                perfectAmmount++;
            }
        }
        System.out.println(perfectAmmount + " " + tooBigAmmount + " " + tooSmallAmmount);
    }
}