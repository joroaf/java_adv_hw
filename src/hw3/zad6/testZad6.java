package hw3.zad6;

import hw3.zad5.Point;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class testZad6 {

    @Test
    public void testZad66() {

        Point[] pointArr = Point.createRandomPointsArray(10);
        Point.sortPointArray(pointArr);

        int[] distances = new int[10];

        Iterator<Point> pointIterator = Arrays.asList(pointArr).iterator();

        Arrays.parallelPrefix(distances, (lastDistance, zeroElement) -> {
            Point p = pointIterator.next();
            return (int) (lastDistance + p.distanceFromZero());
        });

        for (int i : distances) {
            System.out.println(i);
        }
    }

}
