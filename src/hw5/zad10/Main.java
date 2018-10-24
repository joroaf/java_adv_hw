package hw5.zad10;

import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ByteArrayOutputStream out1 = new ByteArrayOutputStream(6);
        ByteArrayOutputStream out2 = new ByteArrayOutputStream(6);
        byte[] in = new byte[]{1, 2, 3, 4, 5, 6};

        TeeOutputStream tos = new TeeOutputStream(out1, out2);
        try {
            tos.write(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertArrayEquals(out1.toByteArray(), out2.toByteArray());
    }
}
