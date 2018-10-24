package hw4.zad7;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // validate input
        if (args.length < 2) {
            System.out.println("Usage: \n java -jar <program-name>.jar <source-file> <destination-file>");
        } else {
            FileCopier fc = new FileCopier(new File(args[0]), new File(args[1]));
            fc.copyFiles();
        }
    }
}
