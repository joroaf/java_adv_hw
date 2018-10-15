package hw2.zad3;


public class LamdasHW {

    public static <T extends Comparable<T>> void modifyArray(IModifyArray<T> modificator, T[] arr) {
        modificator.run(arr);
    }
}
