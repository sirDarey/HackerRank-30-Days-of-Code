package _30DaysOfCode;

/**
 *
 * @author Sir Darey
 */
public class Day21_Generics <T>{
    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    void printArray (T [] array) {
        for(T element : array)
            System.out.println(element);
    }
}

