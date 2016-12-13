package test.dataStructure.queue;

import main.com.sshkim.dataStructure.queue.LinkedQueue;
import org.junit.Test;

/**
 * Created by sshkim on 2016. 12. 7..
 */
public class TestLinkedQueue {

    @Test
    public void enqueue_dequeue_first() {
        LinkedQueue linkedQueue = new LinkedQueue();

        for (int i = 0; i < 10; i++) {
            linkedQueue.enqueue(i + 1);
        }

        while (!linkedQueue.isEmpty()) {
            System.out.println(linkedQueue.length() + " | " + linkedQueue.first() + " | " + linkedQueue.dequeue());
        }
    }
}