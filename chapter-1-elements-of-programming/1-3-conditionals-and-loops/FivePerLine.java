/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.3.9 Write a program that, using one for loop and one if statement, prints
 *  the integers from 1,000 to 2,000 with five integers per line. Hint: Use the
 *  % operation.
 *  Last modified:     October 22, 2019
 **************************************************************************** */

public class FivePerLine {
    public static void main(String[] args) {
        int START = 1000;
        int END = 2000;
        int PER_LINE = 5;
        for (int i = START; i <= END; i++) {
            System.out.print(i + " ");
            if ((i + 1) % PER_LINE == 0) {
                System.out.println();
            }
        }
    }
}
