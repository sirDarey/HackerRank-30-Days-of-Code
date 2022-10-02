package _30DaysOfCode;

/**
 *
 * @author Sir Darey
 */
public class Day2_Operators {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = tip_percent  * meal_cost / 100;
        double tax = tax_percent  * meal_cost / 100;
        double sum = meal_cost + tip + tax;
        int result = Math.round((float)sum);
        System.out.println(result);
    }
}
