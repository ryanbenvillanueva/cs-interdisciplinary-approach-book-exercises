/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.32 Color conversion. Several different formats are used to represent
 *  color. For example, the primary format for LCD displays, digital cameras,
 *  and web pages, known as the RGB format, specifies the level of red (R),
 *  green (G), and blue (B) on an integer scale from 0 to 255. The primary
 *  format for publishing books and magazines, known as the CMYK format,
 *  specifies the level of cyan (C), magenta M), yellow (Y), and black (K)
 *  on a real scale from 0.0 to 1.0. Write a program RGBtoCMYK that converts
 *  RGB to CMYK. Take three integers—r, g, and b—from the command line and
 *  print the equivalent CMYK values. If the RGB values are all 0, then the CMY
 *  values are all 0 and the K value is 1; otherwise, use these formulas:
 *  w = max ( r / 255, g / 255, b / 255 )
 *  c = (w - (r / 255)) / w
 *  m = (w - ( g / 255)) / w
 *  y = (w - ( b / 255)) / w
 *  k = 1 - w
 *  Last modified:     October 15, 2019
 **************************************************************************** */

public class RGBtoCMYK {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[0]);

        double w = Math.max((double) r / 255,
                            Math.max((double) g / 255, (double) b / 255));
        double c, m, y, k;
        if (r == 0 && g == 0 && b == 0 || w == 0) {
            c = 0;
            m = 0;
            y = 0;
            k = 1;
        }
        else {
            c = (w - (r / 255)) / w;
            m = (w - (g / 255)) / w;
            y = (w - (b / 255)) / w;
            k = 1 - w;
        }

        System.out.println("cyan    = " + c);
        System.out.println("magenta = " + m);
        System.out.println("yellow  = " + y);
        System.out.println("black   = " + k);


    }
}
