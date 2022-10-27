package _30DaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

/**
 *
 * @author Sir Darey
 */

public class Day28_RegExPatternsAndIntroToDatabases {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
       
        Map <String, Integer> map = new TreeMap<>();
        
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                
                if (emailID.substring(emailID.length()-10, emailID.length()).equals("@gmail.com")) {
                    map.put(firstName, map.getOrDefault(firstName, 0)+1);
                }
                                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        map.entrySet().forEach(x-> {
            for (int i=x.getValue(); i>0; i--){
                System.out.println(x.getKey());
            }                
        });
    }
}