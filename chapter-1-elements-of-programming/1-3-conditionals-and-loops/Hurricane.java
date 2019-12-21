/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Coursera User ID:  Write a program Hurricane.java that that takes the wind
 *  speed (in miles per hour) as an integer command-line argument and prints
 *  whether it qualifies as a hurricane, and if so, whether it is a Category 1,
 *  2, 3, 4, or 5 hurricane. Below is a table of the wind speeds according to
 *  the Saffir-Simpson scale.
 *  Last modified:     12/21/2019
 **************************************************************************** */

public class Hurricane {
    public static void main(String[] args) {
        int windSpeed = Integer.parseInt(args[0]);

        if (windSpeed < 65) System.out.println("Not a hurricane");
        else if (windSpeed < 96) System.out.println("Class 1 hurricane");
        else if (windSpeed < 111) System.out.println("Class 2 hurricane");
        else if (windSpeed < 131) System.out.println("Class 3 hurricane");
        else if (windSpeed < 155) System.out.println("Class 4 hurricane");
        else System.out.println("Class 5 hurricane");
    }
}
