/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.34 Three-sort. Write a program that takes three integer command-line
 *  arguments and prints them in ascending order. Use Math.min() and Math.max().
 *  Last modified:     October 20, 2019
 **************************************************************************** */

public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = (a + b + c) - (min + max);
        System.out.println(min + " " + mid + " " + max);

    }
}
