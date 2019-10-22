/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.3.12 Write a program FunctionGrowth that prints a table of the values
 *  logn, n, n logen, n2, n3, and 2 n for n = 16, 32, 64, ... , 2,048. Use tabs
 *  (\t characters) to align columns.
 *  Last modified:     October 22, 2019
 **************************************************************************** */

public class FunctionGrowth {
    public static void main(String[] args) {
        long FINISH = 2048;
        System.out.println("log n \t\tn \t\t\tn log n \t\tn^2 \t\t\tn^3 \t\t\t2^n");
        for (long i = 2; i <= FINISH; i *= 2) {
            System.out.print((int) Math.log(i));
            System.out.print("\t\t\t");
            System.out.print(i);
            System.out.print("\t\t\t");
            System.out.print((long) (i * Math.log(i)));
            System.out.print("\t\t\t\t");
            System.out.print(i * i);
            System.out.print("\t\t\t\t");
            System.out.print(i * i * i);
            System.out.print("\t\t\t\t");
            System.out.print(Math.pow(2, i));
            System.out.println();
        }
    }
}
