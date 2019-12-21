/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.23 Write a program that takes two integer command-line arguments m and
 *  d and prints true if day d of month m is between 3/20 and 6/20, false
 *  otherwise.
 *  Last modified:     October 20, 2019
 **************************************************************************** */

public class SpringSeason {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        boolean isbetween = (m == 3 && (d >= 20 && d <= 31));
        isbetween = isbetween || (m == 4 && (d >= 1 && d <= 30));
        isbetween = isbetween || (m == 5 && (d >= 1 && d <= 31));
        isbetween = isbetween || (m == 6 && (d >= 1 && d <= 20));
        System.out.println(isbetween);
    }
}
