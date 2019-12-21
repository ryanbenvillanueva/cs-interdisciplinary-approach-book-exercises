/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.31 Mercator projection. The Mercator projection is a conformal
 *  (anglepreserving) projection that maps latitude  and longitude  to
 *  rectangular coordinates (x, y). It is widely used—for example, in nautical
 *  charts and in the maps that you print from the web. Write a program that
 *  takes 0 and the latitude and longitude of a point from the command line
 *  and prints its projection.
 *  Last modified:     October 14, 2019
 **************************************************************************** */

public class MercatorProjection {
    public static void main(String[] args) {
        double lambda0 = Double.parseDouble(args[0]);
        double latitude = Double.parseDouble(args[1]);
        double longitude = Double.parseDouble(args[2]);

        double x = longitude - lambda0;
        double y = Math.log((1 + Math.sin(latitude)) /
                                    (1 - Math.sin(latitude))) / 2;
        System.out.println("Projection (x,y): (" + x + "," + y + ")");
    }
}
