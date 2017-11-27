package test.algorithm;

import main.com.sshkim.algorithm.Calculator;
import org.junit.Test;

/**
 * Created by sshkim on 2016. 11. 7..
 */
public class TestCalculator {

    @Test
    public void calculate(){
        System.out.println(Calculator.calculate("18 + (2 + 3) + ( 5+7)*10"));

//        System.out.println(Calculator.calculate("1+2+  3*  4 +5/ 5"));
    }

}
