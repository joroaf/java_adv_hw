package hw1.zad1;


import java.util.ArrayList;
import java.util.Collection;

public class CircularArray<T> extends ArrayList<T> {

    public CircularArray() {
        super();
    }

    public CircularArray(int initCapacity) {
        super(initCapacity);
    }

    public CircularArray(Collection<? extends T> c) {
        super(c);
    }

    public void addFirst(T e) {
        add(0, e);
    }

    public void addLast(T e) {
        add(e);
    }

    @Override
    public T get(int n) {
        return super.get(n % size());
    }

    public T getFirst() {
        return super.get(0);
    }

    public T getLast() {
        return super.get(size() - 1);
    }

    public T popFirst() {
        return remove(0);
    }

    public T popLast() {
        return remove(size() - 1);
    }

    public void removeFromEnd(int numOfElements) {
        if (numOfElements > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i = 1; i <= numOfElements; i++) {
            remove(size() - i);
        }
    }

    public void removeFromStart(int numOfElements) {
        if (numOfElements > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i = 0; i < numOfElements; i++) {
            remove(i);
        }
    }
}
