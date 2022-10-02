package _30DaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sir Darey
 */
public class Day5_Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i=1; i<=10; i++)
            System.out.println(n +" x "+ i +" = "+ n*i);

        bufferedReader.close();
    }
}
