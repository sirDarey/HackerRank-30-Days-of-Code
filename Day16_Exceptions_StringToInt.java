package _30DaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sir Darey
 */

public class Day16_Exceptions_StringToInt {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        
        try {
            System.out.println(Integer.parseInt(S));
        }catch (Exception e) {
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}
