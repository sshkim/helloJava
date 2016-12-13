package main.com.sshkim.dataStructure.queue;

import main.com.sshkim.dataStructure.Node;

import java.util.NoSuchElementException;

/**
 * Created by sshkim on 2016. 12. 7..
 */
public class LinkedQueue {

    private int length;
    private Node front, rear;

    public LinkedQueue() {
        length = 0;
    }

    public void enqueue(int data) {
        Node node = new Node(data);
        if (length == 0)
            front = node;
        else
            rear.setNext(node);

        rear = node;
        length++;
    }

    public Node dequeue() {
        if (length == 0)
            throw new NoSuchElementException();

        Node tmp = front;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.getNext();
        }

        length--;
        return tmp;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public int first() {
        if (length == 0)
            throw new NoSuchElementException();

        return front.getData();
    }

}
