/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.30 Uniform random numbers. Write a program that prints five uniform
 *  random numbers between 0 and 1, their average value, and their minimum
 *  and maximum values. Use Math.random(), Math.min(), and Math.max().
 *  Last modified:     October 14, 2019
 **************************************************************************** */

public class UniformRandomNumbers {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        double average = (a + b + c + d + e) / 5;
        double minimum = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        double maximum = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));

        System.out.println("Uniform Random Numbers between 0 and 1");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println("Their average value: " + average);
        System.out.println("The minimum value: " + minimum);
        System.out.println("The maximum value: " + maximum);


    }
}
