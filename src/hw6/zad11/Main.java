package hw6.zad11;

import hw1.zad1.CircularArray;
import org.junit.Assert;

import java.io.*;

public class Main {
    /**
     * Because the class CircularArray extends ArrayList, there is no need to predefine
     * Serializable and Cloneable functionality
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File saveFile = new File("./save.obj");

        CircularArray<Integer> circularArray = new CircularArray<>(5);
        circularArray.add(1);
        circularArray.add(2);
        circularArray.add(3);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(saveFile));
        objectOutputStream.writeObject(circularArray);
        objectOutputStream.flush();
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(saveFile));
        CircularArray<Integer> restoredCircularArray = (CircularArray<Integer>) objectInputStream.readObject();

        Assert.assertArrayEquals(circularArray.toArray(), restoredCircularArray.toArray());
        Assert.assertArrayEquals(circularArray.toArray(), ((CircularArray<Integer>) circularArray.clone()).toArray());
    }
}
