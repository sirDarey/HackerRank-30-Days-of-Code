package _30DaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Sir Darey
 */

public class Day11_2DArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int max = -60;
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                int temp = 0;
                for  (int k=j; k<=j+2; k++) {
                    temp += arr.get(i).get(k);
                    temp += arr.get(i+2).get(k);
                }
                temp += arr.get(i+1).get(j+1);
                max = Math.max(max, temp);
            }
        }
        
        System.out.println(max);
        bufferedReader.close();
    }
}
