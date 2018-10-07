package hw1;

import hw1.zad1.CircularArray;
import org.junit.Assert;
import org.junit.Test;

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
    }
}
