package _30DaysOfCode;

import java.util.Scanner;

/**
 *
 * @author Sir Darey
 */
public class Day1_DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int iInput = scan.nextInt();
        double dInput =scan.nextDouble();
        String sInput = scan.next();
        while (scan.hasNext())
            sInput += " "+scan.next();
        
        System.out.println(i+iInput);
        System.out.printf("%.1f",d+dInput);
        System.out.println();
        System.out.print(s+sInput);
        scan.close();
    }
}
