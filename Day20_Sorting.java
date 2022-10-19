package _30DaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author Sir Darey
 */
public class Day20_Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        bufferedReader.close();

        int numSwaps = 0;
        
        for (int i=1; i<n; i++) {
            int tempSwaps = 0;
            for (int j=0; j<n-1; j++) {
                int current = a.get(j);
                int next = a.get(j+1);
                if (current > next) {
                    int temp = next;
                    a.set(j+1, current);
                    a.set(j, temp);
                    
                    tempSwaps++;
                }
            }
            if (tempSwaps == 0)
                break;
            numSwaps += tempSwaps;
        }
        
        System.out.println("Array is sorted in "+numSwaps+" swaps.");
        System.out.println("First Element: "+a.get(0));
        System.out.println("Last Element: "+a.get(n-1));
    }
}
