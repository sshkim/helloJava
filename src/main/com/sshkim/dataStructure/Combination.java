package main.com.sshkim.dataStructure;

/**
 * Created by sshkim on 2016. 10. 21..
 */
public class Combination {

    public static void main(String[] args){
        String[] language = {"a", "b", "c", "d", "e", "f"};
        int n = language.length;
        int r = 3;

        int result = getCombination(n, r);

        System.out.println(result);

    }

    private static int getCombination(int n, int r) {
        return Permutation.permutationCount(n, r) / Factorial.factorial(r);
    }
}
