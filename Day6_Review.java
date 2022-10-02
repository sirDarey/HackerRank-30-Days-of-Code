package _30DaysOfCode;

import java.util.Scanner;

/**
 *
 * @author Sir Darey
 */
public class Day6_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int j=0; j<n; j++) {
            String s = scan.next();                
            String ans = "";
            for  (int i=0; i<s.length(); i+=2)
                ans += s.charAt(i);
            ans += " ";            
            for  (int i=1; i<s.length(); i+=2)
                ans += s.charAt(i);
            System.out.println(ans);
        }
        
        scan.close();
    }
}
