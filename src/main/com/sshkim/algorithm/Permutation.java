package main.com.sshkim.algorithm;

/**
 * Created by sshkim on 2016. 10. 21..
 */
public class Permutation {

    private final static String[] language = new String[]{"a", "b", "c", "d", "e", "f"};
    private final static int n = language.length;

    public static void main(String[] args){
        int r = 2;
        int result = permutation(n, r);
        System.out.printf("result: " + result);

    }

    public static int permutation(int n, int r) {
        int result = 0;
        for (int i = n; n-r < i; i--) {
            if(i == n){
                result = i;
            }else{
                result *= i;
            }
        }
        return result;
    }
}
