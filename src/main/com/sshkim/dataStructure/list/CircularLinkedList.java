package main.com.sshkim.dataStructure.list;

import main.com.sshkim.dataStructure.Node;

import java.util.NoSuchElementException;

/**
 * Created by sshkim on 2016. 12. 6..
 */
// 기존의 LinkdedList와 크게 차이가 없어 간단히 처리

//TODO
public class CircularLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public CircularLinkedList() {
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void insertHead(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
        if (length == 0) {
            tail = node;
        }
        tail.setNext(head);
        length++;
    }

    public void insertTail(int data) {
        Node node = new Node(data);
        if (length == 0) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        tail.setNext(head);
        length++;
    }

    private Node getNode(int position) {
        if (position >= length)
            throw new NoSuchElementException();
        int i = 0;
        Node tmp = head;
        while (i < position) {
            tmp = tmp.getNext();
            i++;
        }
        return tmp;
    }

    public void insert(int data, int position) {
        if (position == 0) {
            insertHead(data);
        } else if (position >= length) {
            insertTail(length);
        } else {
            Node node = new Node(data);
            Node tmp1 = getNode(position - 1);
            Node tmp2 = tmp1.getNext();
            tmp1.setNext(node);
            node.setNext(tmp2);
            length++;
        }
    }

    public void removeHead() {
        if (length == 0)
            throw new NoSuchElementException();

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            tail.setNext(head);
        }

        length--;
    }

    public void removeTail() {
        if (length == 0)
            throw new NoSuchElementException();

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            Node tmp = getNode(length - 2);
            tmp.setNext(head);
        }

        length--;
    }

    public void remove(int data, int position) {
        length--;
    }

    public int get(int position) {
        return getNode(position).getData();
    }
}
