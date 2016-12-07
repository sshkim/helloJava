package main.com.sshkim.dataStructure.stack;

import java.util.EmptyStackException;

/**
 * Created by sshkim on 2016. 11. 1..
 */
public class Stack {

    private int stackSize;
    private int[] stackArr;
    private int top;

    public Stack(int size) {
        this.stackSize = size;
        this.stackArr = new int[size];
        this.top = -1;
    }

    public void push(int data){
        if (isStackFull())
            throw new StackOverflowError();

        stackArr[++top] = data;
    }

    public int pop(){
        if(isEmpty())
            throw new EmptyStackException();

        int entry = stackArr[top--];
        return entry;
    }

    public int peek() {
        return stackArr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isStackFull() {
        return top == stackSize - 1;
    }
}
