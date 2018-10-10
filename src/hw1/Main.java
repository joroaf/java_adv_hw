package hw1;

import hw1.zad1.CircularArray;
import hw1.zad2.LinkedListQueue;
import hw1.zad3.LamdasHW;
import hw1.zad4.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    @Test
    public void testCircularArray() {
        CircularArray<Integer> circularArray = new CircularArray<>(6);

        circularArray.add(1);
        circularArray.addLast(2);
        circularArray.add(3);
        circularArray.addFirst(0);
        circularArray.addLast(4);
        circularArray.addLast(5);

        Assert.assertArrayEquals(new Integer[]{0, 1, 2, 3, 4, 5}, circularArray.toArray());
        Assert.assertEquals(6, circularArray.size());

        Assert.assertEquals(new Integer(1), circularArray.get(7));
        Assert.assertEquals(new Integer(0), circularArray.getFirst());
        Assert.assertEquals(new Integer(5), circularArray.getLast());

        Assert.assertEquals(new Integer(0), circularArray.popFirst());
        Assert.assertEquals(new Integer(5), circularArray.popLast());

        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4}, circularArray.toArray());
        Assert.assertEquals(4, circularArray.size());

        circularArray.removeFromStart(2);
        Assert.assertArrayEquals(new Integer[]{3, 4}, circularArray.toArray());

        circularArray.removeFromEnd(2);
        Assert.assertArrayEquals(new Integer[]{}, circularArray.toArray());
    }

    @Test
    public void testLinkedListQueue() {
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();

        linkedListQueue.add(1);
        linkedListQueue.add(2);
        linkedListQueue.add(3);
        linkedListQueue.add(4);
        linkedListQueue.add(5);

        Assert.assertEquals(5, linkedListQueue.size());

        Assert.assertEquals(1, linkedListQueue.poll().intValue());
        Assert.assertEquals(4, linkedListQueue.size());

        Assert.assertEquals(2, linkedListQueue.peek().intValue());
        Assert.assertEquals(4, linkedListQueue.size());
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
