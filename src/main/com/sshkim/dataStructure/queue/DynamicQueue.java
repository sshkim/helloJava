package main.com.sshkim.dataStructure.queue;

import java.util.NoSuchElementException;

/**
 * Created by sshkim on 2016. 12. 7..
 */

public class DynamicQueue {

    private int[] queueArr;
    private int length, front, rear;

    private static final int DEFAULT_CAPACITY = 16;

    private int capacity;

    public DynamicQueue() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicQueue(int capacity) {
        queueArr = new int[capacity];
        this.capacity = capacity;
    }

    public void enqueue(int data) {
        if (isFull())
            expand();

        rear = rear % capacity;
        queueArr[rear++] = data;
        length++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new NoSuchElementException();

        int data = queueArr[front];
        queueArr[front++] = Integer.MIN_VALUE;
        length--;
        return data;
    }

    public void expand() {
        capacity = length << 1;
        int[] tmp = new int[capacity];
        rear = 0;
        for (int i = front; i < length; i++) {
            tmp[rear++] = queueArr[i % length];
        }
        queueArr = tmp;
        front = 0;
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
