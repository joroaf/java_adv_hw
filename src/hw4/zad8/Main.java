package hw4.zad8;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        walkin(new File("."), 0);
    }

    private static void walkin(File dir, int depth) {

        File files[] = dir.listFiles();
        StringBuffer pading = new StringBuffer();

        for (int i = 0; i < depth; i++) {
            pading.append(' ');
        }

        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println(pading + " (dir) " + f.getName());
                    walkin(f, ++depth);
                    depth--;
                } else {
                    System.out.println(pading + " (file) " + f.getName() + " " + f.length() / 1000 + " KB");
                }
            }
        }
    }
}
