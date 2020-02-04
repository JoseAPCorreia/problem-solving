//https://hyperskill.org/learn/step/2191

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = 0;
        int cnt = 0;
        
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                cnt++;
            }
        }
        
        double avg = (double) sum / cnt;
        
        System.out.println(avg);
    }
}