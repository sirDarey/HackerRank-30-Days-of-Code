package _30DaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sir Darey
 */
public class Day3_IntroToConditionalStatements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if ((N&1) == 1)
            System.out.println("Weird");
        else {
            if (N >=2 && N<5)
                System.out.println("Not Weird");
            else if (N>=6 && N<=20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
        }
        bufferedReader.close();
    }
}
