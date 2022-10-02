package _30DaysOfCode;

import java.io.IOException;

/**
 *
 * @author Sir Darey
 */

public class Day9_Recursion3 {
    public static void main(String[] args) throws IOException {
        System.out.println(Day9_Recursion3.factorial(3));
    }
    
    //Calculatiing Factorials
    public static int factorial(int n) {
        if (n == 1) return 1;
        
        return n*factorial(n-1);  
    }
}
