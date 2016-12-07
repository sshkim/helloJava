package test.dataStructure.Stack;

import main.com.sshkim.dataStructure.stack.Stack;
import org.junit.Test;

import java.util.EmptyStackException;

/**
 * Created by sshkim on 2016. 12. 7..
 */
public class TestStack {

    @Test
    public void pop_push_peek() {
        Stack stack = new Stack(10);

        int i = 0;
        while(!stack.isStackFull()){
            stack.push(++i);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.peek() + " | " + stack.pop());
        }
    }

    @Test(expected = StackOverflowError.class)
    public void error_OverFlow() {
        Stack stack = new Stack(10);

        for (int i = 0; i <= 10; i++) {
            stack.push(i+1);
        }
    }

    @Test(expected = EmptyStackException.class)
    public void error_EmptyStack() {
        Stack stack = new Stack(10);

        for (int i = 0; i < 10; i++) {
            stack.push(i+1);
        }

        for (int i = 0; i <= 10; i++) {
            stack.pop();
        }
    }

}
