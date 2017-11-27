package main.com.sshkim.dataStructure;

/**
 * Created by sshkim on 2016. 11. 21..
 */
//TODO
public class Vector<E> {

    private Object[] data;
    private int size;
    private int capacity;

    public Vector(int size) {

        data = new Object[size];
        capacity = size;
    }

    public void add(int idx, E element) {

    }

    public boolean add(E element) {

        if (size == 0) {
            data[0] = element;
        } else {
            for (int i = size; i > 0; i--) {
                data[i + 1] = data[i];
            }
        }
        return true;
    }

    public boolean contains(E element) {

        return true;
    }

//    public Enumeration elements() {
//
//    }

//    public boolean equals(E element) {
//
//        return true;
//    }

    public E firstElement() {

        return getElement(0);
    }

    public E get(int idx) {
        if (idx >= size)
            throw new ArrayIndexOutOfBoundsException(idx + " >= " + size);

        return getElement(idx);
    }

    public int indexOf(E element, int idx) {

        return -1;
    }

    public void indexElementAt(E element, int idx) {

    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public E lastElement() {
        return getElement(size - 1);
    }

    public int lastIndexOf(E element, int idx) {

        return -1;
    }

    public Object remove(int idx) {

        return data[0];
    }

    public void removeAll() {
        this.size = 0;
    }

    public void removeRange(int fromIdx, int toIdx) {
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public Object[] toArray() {
        return this.data;
    }

    private E getElement(int idx) {
        return (E) data[idx];
    }
}
