package hw3;


import hw3.zad5.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

    }

    @Test
    public void testZad5() {
        Point[] pointArr = Point.createRandomPointsArray(10);
        Assert.assertEquals(10, pointArr.length);

        // Print all Points before sort
        System.out.println("Before Sort");
        Arrays.asList(pointArr).forEach(System.out::println);

        // Sort
        Point.sortPointArray(pointArr);

        // Print all Points after sort
        System.out.println("\nAfter Sort");
        Arrays.asList(pointArr).forEach(System.out::println);

        Point firstElement = pointArr[0];
        Assert.assertEquals(0, Point.indexOf(pointArr, firstElement));
    }
}
