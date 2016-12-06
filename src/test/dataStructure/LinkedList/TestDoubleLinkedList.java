package test.dataStructure.LinkedList;

import main.com.sshkim.dataStructure.linkedList.DoubleLinkedList;
import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

/**
 * Created by sshkim on 2016. 11. 17..
 */
public class TestDoubleLinkedList {
    private boolean useInit = true;

    @Test
    public void insertStartAt() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertHead(3);
        Assert.assertEquals(3, doubleLinkedList.get(0));

        doubleLinkedList.insertHead(2);
        doubleLinkedList.insertHead(1);

        Assert.assertEquals(1, doubleLinkedList.get(0));
        Assert.assertEquals(2, doubleLinkedList.get(1));
        Assert.assertEquals(3, doubleLinkedList.get(2));

        Assert.assertEquals(3, doubleLinkedList.length());
    }

    @Test
    public void insertEndAt() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertTail(1);
        doubleLinkedList.insertTail(2);
        doubleLinkedList.insertTail(3);

        Assert.assertEquals(1, doubleLinkedList.get(0));
        Assert.assertEquals(2, doubleLinkedList.get(1));
        Assert.assertEquals(3, doubleLinkedList.get(2));

        Assert.assertEquals(3, doubleLinkedList.length());
    }

    @Test
    public void removeHead() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        int i = 0;
        while (i < 100) {
            doubleLinkedList.insertTail(++i);
        }
        doubleLinkedList.removeHead();

        Assert.assertEquals(2, doubleLinkedList.get(0));
        Assert.assertEquals(99, doubleLinkedList.length());
    }

    @Test
    public void removeTail() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        int i = 0;
        while (i < 100) {
            doubleLinkedList.insertTail(++i);
        }
        doubleLinkedList.removeTail();

        Assert.assertEquals(1, doubleLinkedList.get(0));
        Assert.assertEquals(99, doubleLinkedList.get(98));
        Assert.assertEquals(99, doubleLinkedList.length());
    }

    @Test(expected = NoSuchElementException.class)
    public void wrongTest() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.insertTail(1);
        doubleLinkedList.removeHead();

        Assert.assertNull(doubleLinkedList.get(0));
    }

    @Test
    public void positionByData() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        int i = 0;
        while (i < 100) {
            doubleLinkedList.insertTail(++i);
        }

        Assert.assertEquals(0, doubleLinkedList.getPosition(1));
        Assert.assertEquals(99, doubleLinkedList.getPosition(100));
    }

    @Test
    public void insert() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        int i = 0;
        while (i < 100) {
            doubleLinkedList.insert(++i, i-1);
        }
        Assert.assertEquals(1, doubleLinkedList.get(0));
        Assert.assertEquals(100, doubleLinkedList.get(99));

        doubleLinkedList.insert(101, 10000);
        Assert.assertEquals(101, doubleLinkedList.get(100));

        doubleLinkedList.insert(0, 0);
        Assert.assertEquals(0, doubleLinkedList.get(0));
    }

    @Test
    public void remove() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        int i = 0;
        while (i < 100) {
            doubleLinkedList.insert(++i, i-1);
        }
        doubleLinkedList.remove(0);
        Assert.assertEquals(99, doubleLinkedList.length());
        Assert.assertEquals(2, doubleLinkedList.get(0));

        int result = doubleLinkedList.get(49);
        doubleLinkedList.remove(48);
        Assert.assertEquals(98, doubleLinkedList.length());
        Assert.assertEquals(result, doubleLinkedList.get(48));
    }



}
