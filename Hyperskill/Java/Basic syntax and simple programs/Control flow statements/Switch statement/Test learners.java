//https://hyperskill.org/learn/step/2737

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        switch (new Scanner(System.in).nextLine()) {
            case "1":
                System.out.println("Yes!");
                break;
            case "2":
            case "3":
            case "4":
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}