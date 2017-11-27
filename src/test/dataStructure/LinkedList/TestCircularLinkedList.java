package test.dataStructure.LinkedList;

import main.com.sshkim.dataStructure.list.CircularLinkedList;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sshkim on 2016. 12. 6..
 */
public class TestCircularLinkedList {

    @Test
    public void insertHead(){
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertHead(1);
        circularLinkedList.insertHead(2);
        circularLinkedList.insertHead(3);
        circularLinkedList.insertHead(4);

        Assert.assertEquals(2, circularLinkedList.get(0));
        Assert.assertEquals(1, circularLinkedList.get(1));
    }

    @Test
    public void insertTail(){
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertTail(4);
        circularLinkedList.insertTail(3);
        circularLinkedList.insertTail(2);
        circularLinkedList.insertTail(1);

        Assert.assertEquals(2, circularLinkedList.get(0));
        Assert.assertEquals(1, circularLinkedList.get(1));
    }

    @Test
    public void insert(){
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insert(1, 0);
        circularLinkedList.insert(2, 1);
        circularLinkedList.insert(3, 2);
        circularLinkedList.insert(4, 3);

        circularLinkedList.insert(1, 1);


        Assert.assertEquals(1, circularLinkedList.get(0));
        Assert.assertEquals(2, circularLinkedList.get(1));
    }

    @Test
    public void removeHead(){
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insert(1, 0);
        circularLinkedList.insert(2, 1);
        circularLinkedList.insert(3, 2);
        circularLinkedList.insert(4, 3);

        circularLinkedList.removeHead();

        Assert.assertEquals(2, circularLinkedList.get(0));
        Assert.assertEquals(3, circularLinkedList.get(1));
    }

}
