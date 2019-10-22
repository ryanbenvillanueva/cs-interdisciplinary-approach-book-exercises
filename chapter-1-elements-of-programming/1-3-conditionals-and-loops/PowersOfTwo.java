/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.3.16 Write a program that takes an integer command-line argument n and
 *  prints all the positive powers of 2 less than or equal to n. Make sure that
 *  your program works properly for all values of n.
 *  Last modified:     October 22, 2019
 **************************************************************************** */

public class PowersOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 0;

        System.out.println("Powers of 2 <= " + n);
        while (Math.pow(2, i) <= n) {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
            i++;
        }


    }

}

