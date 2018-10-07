package hw1.zad2;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQueue<E> extends AbstractQueue<E> {

    private LinkedList<E> elements = new LinkedList<>();

    @Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean offer(E e) {
        return elements.offer(e);
    }

    @Override
    public E poll() {
        return elements.poll();
    }

    @Override
    public E peek() {
        return elements.peek();
    }
}
