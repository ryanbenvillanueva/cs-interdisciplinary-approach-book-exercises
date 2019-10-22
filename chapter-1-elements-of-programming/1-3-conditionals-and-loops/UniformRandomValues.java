/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.3.10 Write a program that takes an integer command-line argument n, uses
 *  Math.random() to print n uniform random values between 0 and 1, and then
 *  prints their average value (see Exercise 1.2.30).
 *  Last modified:     October 22, 2019
 **************************************************************************** */

public class UniformRandomValues {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(n + " Uniform Random Values between 0 and 1");
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double value = Math.random();
            System.out.println("Random Value " + i + ": " + value);
            sum += value;
        }
        double average = sum / n;
        System.out.println("Average value : " + average);
    }
}
