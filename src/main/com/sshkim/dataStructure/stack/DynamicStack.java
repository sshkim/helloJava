package main.com.sshkim.dataStructure.stack;

import java.util.EmptyStackException;

/**
 * Created by sshkim on 2016. 11. 24..
 */
public class DynamicStack {

    private final static int MIN_CAPACITY = 16;
    private int capaicty;
    private int top = -1;
    private int[] stackArr;

    public DynamicStack() {
        this(MIN_CAPACITY);
    }

    public DynamicStack(int capaicty) {
        stackArr = new int[capaicty];
        this.capaicty = capaicty;
    }

    public int size() {
        return this.top + 1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(int data) {
        if (size() == capaicty)
            expand();
        stackArr[++top] = data;
    }

    private void expand() {
        int length = size();
        this.capaicty = length << 1;
        int[] tmp = new int[capaicty];
        System.arraycopy(stackArr, 0, tmp, 0, length);
        stackArr = tmp;
    }

    public int top() {
        if (!isEmpty()) {
            return stackArr[top];
        }
        throw new EmptyStackException();
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int data = stackArr[top];
        stackArr[top--] = Integer.MIN_VALUE;
        return data;
    }
}
