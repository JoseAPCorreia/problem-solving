//https://hyperskill.org/learn/step/2153

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums;
        do{
            nums = input.nextInt();
            if(nums % 2 == 0 && nums != 0){
                System.out.println("even");
            }
            else if(nums != 0)
            {
                System.out.println("odd");
            }
        
        }while(nums != 0);
    }
}