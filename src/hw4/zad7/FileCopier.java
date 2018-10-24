package hw4.zad7;

import java.io.*;

public class FileCopier {

    private BufferedInputStream source;
    private BufferedOutputStream destination;

    FileCopier(File src, File dst) {
        try {
            source = new BufferedInputStream(new FileInputStream(src));
            destination = new BufferedOutputStream(new FileOutputStream(dst));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    void copyFiles() {
        byte[] buff = new byte[1024];
        int readBytes;

        try {
            while ((readBytes = source.read(buff)) != -1) {
                destination.write(buff, 0, readBytes);
            }
            destination.flush();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                source.close();
                destination.close();
            } catch (Exception e) {
                // nop
            }
        }
    }
}
