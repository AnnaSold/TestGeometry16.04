import alkaz.Point;
import alkaz.Triangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WokWithTriangles {
    public static ArrayList<Triangle> readFile(String filename) throws FileNotFoundException {

        ArrayList<Triangle> triangles = new ArrayList<>();
        Scanner scan = new Scanner(new File(filename));

        while (scan.hasNext()) {
            Point a = new Point( scan.nextDouble(), scan.nextDouble());
            Point b = new Point( scan.nextDouble(), scan.nextDouble());
            Point c = new Point( scan.nextDouble(), scan.nextDouble());

            triangles.add(new Triangle(a, b,c));
        }
        scan.close();
        System.out.println(triangles);
        return triangles;
    }
}
