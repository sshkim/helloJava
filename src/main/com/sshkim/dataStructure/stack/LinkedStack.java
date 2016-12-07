package main.com.sshkim.dataStructure.stack;

import main.com.sshkim.dataStructure.Node;

import java.util.EmptyStackException;

/**
 * Created by sshkim on 2016. 12. 2..
 */
public class LinkedStack {

    private int size;
    private Node top;

    public LinkedStack() {
        size = 0;
        top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty())
            throw new EmptyStackException();
        int data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    public int top() {
        if (isEmpty())
            throw new EmptyStackException();

        return top.getData();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }


}
