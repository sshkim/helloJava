package main.com.sshkim.dataStructure.linkedList;

import main.com.sshkim.dataStructure.DNode;

import java.util.NoSuchElementException;

/**
 * Created by sshkim on 2016. 11. 21..
 */

public class DoubleLinkedList {

    private DNode head;
    private DNode tail;
    private int length;

    public DoubleLinkedList() {
        length = 0;
    }

    public int get(int position) {
        return getNode(position).getData();
    }

    public int getPosition(int data) {
        int i = 0;
        while (i < length) {
            if (get(i) == data)
                return i;
            i++;
        }

        return Integer.MIN_VALUE;
    }

    public int length() {
        return length;
    }

    public void insertHead(int data) {
        DNode nNode = new DNode(data, null, head);
        if (length == 0) {
            tail = nNode;
        } else {
            head.setPrev(nNode);
        }
        head = nNode;
        length++;
    }

    public void insert(int data, int position) {
        if (position >= length || length == 0) {
            insertTail(data);
        } else {
            DNode tmp = getNode(position);
            DNode nNode = new DNode(data, tmp.getPrev(), tmp);
            if (position != 0) {
                nNode.getPrev().setNext(nNode);
            } else {
                head = nNode;
            }
            tmp.setPrev(nNode);
            length++;
        }
    }

    public void insertTail(int data) {
        DNode nNode = new DNode(data, tail, null);
        if (length == 0) {
            head = nNode;
        } else {
            tail.setNext(nNode);
        }
        tail = nNode;
        length++;
    }

    public void remove(int position) {
        if (position >= length - 1) {
            removeTail();
        } else if (position == 0) {
            removeHead();
        } else {
            DNode tmp = getNode(position);
            tmp.getPrev().setNext(tmp.getNext());
            tmp.getNext().setPrev(tmp.getPrev());
            length--;
        }
    }

    public boolean removeHead() {
        if (length == 0)
            return false;

        head = head.getNext();
        if (head == null)
            tail = null;
        length--;
        return true;
    }

    public boolean removeTail() {
        if (length == 0)
            return false;

        tail = tail.getPrev();
        if (tail == null)
            head = null;
        length--;
        return false;
    }

    public void clearList() {
        head = null;
        tail = null;
        length = 0;
    }

    private DNode getNode(int position) {
        if (position >= length)
            throw new NoSuchElementException();

        int i;
        DNode tmp;
        if (position < length / 2) {
            i = 0;
            tmp = head;
            while (i < position) {
                tmp = tmp.getNext();
                i++;
            }
        } else {
            i = length - 1;
            tmp = tail;
            while (i > position) {
                tmp = tmp.getPrev();
                i--;
            }
        }
        return tmp;
    }

}
