package test.dataStructure.Stack;

import main.com.sshkim.dataStructure.stack.LinkedStack;
import org.junit.Test;

/**
 * Created by sshkim on 2016. 12. 7..
 */
public class TestLinkedStack {

    @Test
    public void push_pop_top() {
        LinkedStack linkedStack = new LinkedStack();

        for (int i = 0; i < 10; i++) {
            linkedStack.push(i+1);
        }

        while(!linkedStack.isEmpty()){
            System.out.println(linkedStack.top() + " | " + linkedStack.pop());
        }
    }

}
