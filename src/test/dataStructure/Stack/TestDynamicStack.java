package test.dataStructure.Stack;

import main.com.sshkim.dataStructure.stack.DynamicStack;
import org.junit.Test;

/**
 * Created by sshkim on 2016. 12. 7..
 */
public class TestDynamicStack {

    @Test
    public void push_pop_top() {
        DynamicStack dynamicStack = new DynamicStack();

        for (int i = 0; i < 100; i++) {
            dynamicStack.push(i + 1);
        }

        while (!dynamicStack.isEmpty()) {
            System.out.println(dynamicStack.top() + " | " + dynamicStack.pop());
        }
    }
}
