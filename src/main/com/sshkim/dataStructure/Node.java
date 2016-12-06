package main.com.sshkim.dataStructure;

/**
 * Created by sshkim on 2016. 11. 17..
 */
public class Node {

    Node next;
    int data;

    public Node() {
        this.data = Integer.MIN_VALUE;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext(){

        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return Integer.toString(data);
    }
}
