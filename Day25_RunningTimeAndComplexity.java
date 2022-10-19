package _30DaysOfCode;

import java.util.Scanner;

/**
 *
 * @author Sir Darey
 */

public class Day25_RunningTimeAndComplexity {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i=0; i<n; i++) 
            System.out.println(isPrime(scan.nextInt()));
    }
    
    static String isPrime(int num) {
        if (num == 2 || num == 3)
            return "Prime";
        if(num == 1 || num%2 == 0)
            return "Not prime";
        for (int i=3; i<num/2; i+=2) {
            if (num%i == 0)
                return "Not prime";
        }
        return "Prime";
    }
}

