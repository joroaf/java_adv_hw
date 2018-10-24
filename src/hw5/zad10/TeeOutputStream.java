package hw5.zad10;

import java.io.*;

public class TeeOutputStream implements Closeable, Flushable, AutoCloseable {

    private BufferedOutputStream o1;
    private BufferedOutputStream o2;

    public TeeOutputStream(OutputStream out1, OutputStream out2) {
        o1 = new BufferedOutputStream(out1);
        o2 = new BufferedOutputStream(out2);
    }

    public void write(byte[] b) throws IOException {
        o1.write(b);
        o2.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException {
        o1.write(b, off, len);
        o2.write(b, off, len);
    }

    public void write(int b) throws IOException {
        o1.write(b);
        o2.write(b);
    }

    @Override
    public void close() throws IOException {
        o1.close();
        o2.close();
    }

    @Override
    public void flush() throws IOException {
        o1.flush();
        o2.flush();
    }
}
