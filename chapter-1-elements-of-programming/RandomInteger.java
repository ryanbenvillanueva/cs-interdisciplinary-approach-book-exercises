/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.19 Write a program that takes two integer command-line arguments
 *  a and b and prints a random integer between a and b, inclusive.
 *  Last modified:     October 12, 2019
 **************************************************************************** */

public class RandomInteger {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int range = (max - min) + 1;
        int randomInt = (int) (Math.random() * range) + min;
        System.out.println(randomInt);
    }
}
