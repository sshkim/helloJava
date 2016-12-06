package main.com.sshkim.dataStructure;

/**
 * Created by sshkim on 2016. 11. 17..
 */
public class DNode {

    DNode prev;
    DNode next;
    int data;

    public DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public DNode(int data, DNode prev, DNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
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
