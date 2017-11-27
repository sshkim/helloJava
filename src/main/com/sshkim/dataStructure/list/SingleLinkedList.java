package main.com.sshkim.dataStructure.list;

import main.com.sshkim.dataStructure.Node;

/**
 * Created by sshkim on 2016. 11. 17..
 */
public class SingleLinkedList {

    private int length = 0;
    Node head;

    public SingleLinkedList() {
        this.length = 0;
    }

    public synchronized Node getHead() {
        return this.head;
    }

    public synchronized void insertStartAt(Node node) {
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
        length++;
    }

    public synchronized void insertEndAt(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node p = head, q = null;
            while ((q = p.getNext()) != null) {
                p = q;
            }
            p.setNext(node);
        }
        length++;
    }

    public void insert(int pos, int data) {
        if (pos > length)
            pos = length;

        if (pos < 0)
            pos = 0;

        Node p = head;
        if (head == null) {
            head = new Node(data);
        } else if (pos == 0) {
            head = new Node(data);
            head.setNext(p);
        } else {
            for (int i = 1; i < pos; i++) {
                p = p.getNext();
            }
            Node iNode = new Node(data);
            iNode.setNext(p.getNext());
            p.setNext(iNode);
        }
        length++;
    }

    public boolean removeFromBegin() {
        if (head == null) {
            return false;
        }
        Node p = head;
        head = p.getNext();
        p.setNext(null);
        length--;
        return true;
    }

    public boolean removeFromEnd() {
        if (head == null) {
            return false;
        }

        Node p = head, q = null, next = head.getNext();
        if (next == null) {
            head = null;
            length--;
            return true;
        }

        while ((next = p.getNext()) != null) {
            q = p;
            p = next;
        }
        q.setNext(null);
        length--;
        return true;
    }

    public boolean removeMatched(Node node) {
        if (head == null)
            return false;

        if (head.equals(node)) {
            head = head.getNext();
        } else {
            Node p = head, q = null;
            while ((p = p.getNext()) != null) {
                if (p.equals(node)) {
                    p.setNext(null);
                    q.setNext(p.getNext());
                    break;
                }
                q = p;
            }
        }

        length--;
        return true;
    }

    public boolean remove(int pos) {
        if (pos > length)
            pos = length;

        if (pos < 0)
            pos = 0;

        if (head == null) {
            return false;
        } else if (pos == 0) {
            head = head.getNext();
        } else {
            Node p = head, q = null;
            for (int i = 0; i < pos; i++) {
                q = p;
                p = p.getNext();
            }
            q.setNext(p.getNext());
        }

        length--;
        return true;
    }


    public int getPosition(int data) {
        Node p = head;
        int cnt = 0;
        while (p != null) {
            if (p.getData() == data) {
                return cnt;
            }
            cnt++;
            p = p.getNext();
        }
        return Integer.MIN_VALUE;
    }

    public Node getLast() {
        if (head == null) return null;

        Node p = head;
        while (p.getNext() != null)
            p = p.getNext();

        return p;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void clearList() {
        length = 0;
        head = null;
    }

}
