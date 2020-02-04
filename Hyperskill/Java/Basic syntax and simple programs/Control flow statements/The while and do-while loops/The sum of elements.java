//https://hyperskill.org/learn/step/2227

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        int total = 0;
        int nums;
        
        do{
            nums = input.nextInt();
            total += nums;
        }
        while(nums != 0);

        System.out.println(total);
    }
}