package test.dataStructure.queue;

import main.com.sshkim.dataStructure.queue.DynamicQueue;
import org.junit.Test;

/**
 * Created by sshkim on 2016. 12. 7..
 */
public class TestDynamicQueue {

    @Test
    public void enqueue_dequeue() {
        DynamicQueue dynamicQueue = new DynamicQueue();

        int i = 0;
        for (i = 0; i < 10; i++) {
            dynamicQueue.enqueue(i + 1);
        }

        System.out.println(dynamicQueue.dequeue());

        for (i = i; i < 200; i++) {
            dynamicQueue.enqueue(i + 1);
        }

        while(!dynamicQueue.isEmpty()){
            System.out.println(dynamicQueue.dequeue());
        }
    }


}
