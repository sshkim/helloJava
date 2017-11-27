package main.com.sshkim.dataStructure;

/**
 * Created by sshkim on 2016. 10. 21..
 */
public class Factorial {

    public static int factorial(int n) {
        int result = 1;
        while (n > 1) {
            result *= n;
            n--;
        }
        return result;
    }
}
