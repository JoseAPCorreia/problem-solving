//https://hyperskill.org/learn/step/2189

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
        int numbers = scanner.nextInt();
        int result = 0;
    
        for(int i = 0; i < numbers; i++){
            int nums = scanner.nextInt();
            if(nums % 4 == 0){
                if(nums > result){
                result = nums;
                }
            }
        }
        System.out.println(result);
    }
}