package main.com.sshkim.dataStructure.queue;

import java.util.NoSuchElementException;

/**
 * Created by sshkim on 2016. 12. 7..
 */

public class FixedArrayQueue {

    private int[] queueArr;
    private int length, front, rear;
    private static final int DEFAULT_CAPACITY = 16;

    private int capacity;

    public FixedArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    public FixedArrayQueue(int capacity) {
        queueArr = new int[capacity];
        this.capacity = capacity;
    }

    public void enqueue(int data) {
        if (isFull())
            throw new ArrayIndexOutOfBoundsException();

        rear = rear % capacity;
        queueArr[rear++] = data;
        length++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new NoSuchElementException();

        front = front % capacity;
        length--;

        return queueArr[front++];
    }

    public boolean isFull() {
        return length == capacity;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

}
