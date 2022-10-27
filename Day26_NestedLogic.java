package _30DaysOfCode;

import java.util.Scanner;

/**
 *
 * @author Sir Darey
 */

public class Day26_NestedLogic {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rD = scan.nextInt();
        int rM = scan.nextInt();
        int rY = scan.nextInt();
        int dD = scan.nextInt();
        int dM = scan.nextInt();
        int dY = scan.nextInt();
        
        if (rY > dY)
            System.out.println(10000); 
        else if (rY == dY) {
            if (rM > dM){
                int fee = 500 * (rM - dM);
                System.out.println(fee);
            } else if (rM == dM) {
                if (rD > dD) {
                    int fee = 15 * (rD - dD);
                    System.out.println(fee);
                } else 
                    System.out.println(0);
            } else
                System.out.println(0);
        }
        else 
            System.out.println(0);
        scan.close();    
    }
}

