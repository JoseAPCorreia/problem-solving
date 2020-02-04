//https://hyperskill.org/learn/step/2735

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        if(size < 1){
            System.out.println("no army");
        }
        else if(size <= 4){
            System.out.println("few");
        }
         else if(size <= 9){
            System.out.println("several");
        }
         else if(size <= 19){
            System.out.println("pack");
        }
         else if(size <= 49){
            System.out.println("lots");
        }
         else if(size <= 99){
            System.out.println("horde");
        }
         else if(size <= 249){
            System.out.println("throng");
        }
         else if(size <= 499){
            System.out.println("swarm");
        }
         else if(size <= 999){
            System.out.println("zounds");
        }
        else{
            System.out.println("legion");
        }
    }
}