package hw2;


import hw2.zad3.LamdasHW;
import hw2.zad4.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    @Test
    public void testHW3Lambdas() {

        // Test Sorting
        Integer[] arr = new Integer[]{3, 2, 1};
        LamdasHW.modifyArray(Arrays::sort, arr);
        Assert.assertArrayEquals(new Integer[]{1, 2, 3}, arr);

        // Test Reversing
        LamdasHW.modifyArray((inArr) -> {
            for (int i = 0; i < inArr.length / 2; i++) {
                int temp = inArr[i];
                inArr[i] = inArr[inArr.length - i - 1];
                inArr[inArr.length - i - 1] = temp;
            }
        }, arr);
        Assert.assertArrayEquals(new Integer[]{3, 2, 1}, arr);
    }

    @Test
    public void testHW3Point() {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(1, 1);

        Point[] arr = new Point[]{p1, p2, p3};

        LamdasHW.modifyArray(Arrays::sort, arr);

        Assert.assertArrayEquals(new Point[]{p3, p1, p2}, arr);
    }
}
