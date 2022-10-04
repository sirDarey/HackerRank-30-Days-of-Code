package _30DaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sir Darey
 */

// Print max consecutive 1's in a binary representation of a denary number
// E.g. 5 -> 101 -> 1
//      6 -> 110 -> 2
//      13 -> 1101 -> 2
//      125 -> 1111101 -> 5

public class Day10_BinaryNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int max = 0, count = 1;
        while (n > 0) {
            if ((n&1) == 1) { //check if number is odd
                max = Math.max(max, count);
                count++;
            } else {
                count = 1;
            }
            n >>= 1; //right shift n; thus, dividing n by 2
        }
        System.out.println(max);

        bufferedReader.close();
    }
}
