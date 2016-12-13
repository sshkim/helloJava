package test.dataStructure.queue;

import main.com.sshkim.dataStructure.queue.FixedArrayQueue;
import org.junit.Test;

import java.util.NoSuchElementException;

/**
 * Created by sshkim on 2016. 12. 7..
 */
public class TestFixedArrayQueue {

    @Test
    public void enqueue_dequeue() {
        FixedArrayQueue fixedArrayQueue = new FixedArrayQueue();

        for (int i = 0; i < 10; i++) {
            fixedArrayQueue.enqueue(i + 1);
        }

        while (!fixedArrayQueue.isEmpty()) {
            System.out.println(fixedArrayQueue.dequeue());
        }

        for (int i = 0; i < 10; i++) {
            fixedArrayQueue.enqueue(i + 1);
        }

        while (!fixedArrayQueue.isEmpty()) {
            System.out.println(fixedArrayQueue.dequeue());
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void over_enqueue() {
        FixedArrayQueue fixedArrayQueue = new FixedArrayQueue(3);

        for (int i = 0; i < 4; i++) {
            fixedArrayQueue.enqueue(i + 1);
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void nothing_dequeue() {
        FixedArrayQueue fixedArrayQueue = new FixedArrayQueue();

        for (int i = 0; i < 10; i++) {
            fixedArrayQueue.enqueue(i + 1);
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(fixedArrayQueue.dequeue());
        }
    }
}
