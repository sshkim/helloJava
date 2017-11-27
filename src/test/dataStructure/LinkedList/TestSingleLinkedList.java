package test.dataStructure.LinkedList;

import main.com.sshkim.dataStructure.Node;
import main.com.sshkim.dataStructure.list.SingleLinkedList;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sshkim on 2016. 11. 17..
 */
public class TestSingleLinkedList {

    @Test
    public void insertEndAt(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertEndAt(new Node(1));
        singleLinkedList.insertEndAt(new Node(2));
        singleLinkedList.insertEndAt(new Node(3));

        Assert.assertEquals(singleLinkedList.getHead().getData(), 1);
        Assert.assertEquals(singleLinkedList.getLast().getData(), 3);
        Assert.assertEquals(singleLinkedList.length(), 3);
    }

    @Test
    public void insertStartAt(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertStartAt(new Node(3));
        singleLinkedList.insertStartAt(new Node(2));
        singleLinkedList.insertStartAt(new Node(1));

        Assert.assertEquals(singleLinkedList.getHead().getData(), 1);
        Assert.assertEquals(singleLinkedList.getLast().getData(), 3);
        Assert.assertEquals(singleLinkedList.length(), 3);
    }

    @Test
    public void insert(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insert(0, 1);
        singleLinkedList.insert(1, 2);
        singleLinkedList.insert(2, 3);
        singleLinkedList.insert(5, 4);
        singleLinkedList.insert(0, 0);
        singleLinkedList.insert(2, 2);

        Assert.assertEquals(singleLinkedList.getHead().getData(), 0);
        Assert.assertEquals(singleLinkedList.getLast().getData(), 4);
        Assert.assertEquals(singleLinkedList.length(), 6);
    }

    @Test
    public void removeFromBegin(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertStartAt(new Node(3));
        singleLinkedList.insertStartAt(new Node(2));
        singleLinkedList.insertStartAt(new Node(1));
        singleLinkedList.removeFromBegin();

        Assert.assertEquals(singleLinkedList.getHead().getData(), 2);

        singleLinkedList.removeFromBegin();
        Assert.assertEquals(singleLinkedList.getHead().getData(), 3);
        Assert.assertEquals(singleLinkedList.length(), 1);
    }

    @Test
    public void removeFromEnd(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertStartAt(new Node(3));
        singleLinkedList.insertStartAt(new Node(2));
        singleLinkedList.insertStartAt(new Node(1));

        singleLinkedList.removeFromEnd();
        Assert.assertEquals(singleLinkedList.getLast().getData(), 2);

        singleLinkedList.removeFromEnd();
        Assert.assertEquals(singleLinkedList.getLast().getData(), 1);

        Assert.assertEquals(singleLinkedList.length(), 1);
    }

    @Test
    public void removeMatched(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Node three = new Node(3);
        Node two = new Node(2);
        Node one = new Node(1);
        singleLinkedList.insertStartAt(three);
        singleLinkedList.insertStartAt(two);
        singleLinkedList.insertStartAt(one);

        singleLinkedList.removeMatched(three);
        Assert.assertEquals(singleLinkedList.getLast().getData(), 2);

        singleLinkedList.removeMatched(one);
        Assert.assertEquals(singleLinkedList.getHead().getData(), 2);

        Assert.assertEquals(singleLinkedList.length(), 1);
    }


    @Test
    public void removePosition(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertStartAt(new Node(3));
        singleLinkedList.insertStartAt(new Node(2));
        singleLinkedList.insertStartAt(new Node(1));

        singleLinkedList.remove(2);
        Assert.assertEquals(singleLinkedList.getLast().getData(), 2);

        singleLinkedList.remove(0);
        Assert.assertEquals(singleLinkedList.getHead().getData(), 2);

        Assert.assertEquals(singleLinkedList.length(), 1);
    }


    @Test
    public void getPosition(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertStartAt(new Node(3));
        singleLinkedList.insertStartAt(new Node(2));
        singleLinkedList.insertStartAt(new Node(1));

        Assert.assertEquals(singleLinkedList.getPosition(2), 1);
        Assert.assertEquals(singleLinkedList.getPosition(1), 0);
        Assert.assertEquals(singleLinkedList.getPosition(3), 2);

        Assert.assertEquals(singleLinkedList.length(), 3);
    }

}
