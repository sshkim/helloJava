package main.com.sshkim.dataStructure;

/**
 * Created by sshkim on 2016. 10. 21..
 */
public class Permutation {

    private final static String[] languageArray = new String[]{"a", "b", "c", "d", "e", "f"};
    private final static String language = "abcde";
    private final static int n = languageArray.length;

    public static void main(String[] args) {
        int r = 2;
        int result = permutationCount(n, r);
//        System.out.printf("result: " + result);

        System.out.println(permutation(language));

    }

    public static int permutationCount(int n, int r) {
        int result = 0;
        for (int i = n; n - r < i; i--) {
            if (i == n) {
                result = i;
            } else {
                result *= i;
            }
        }
        return result;
    }

    public static int permutation(String n) {
        int length = n.length();
        int cnt = 0;

        for (int i = 0; i < length; i++) {
            cnt += permutation(n.charAt(i) + "", n.substring(0, i) + n.substring(i + 1));
        }

        return cnt;
    }

    private static int permutation(String lang, String n) {
        int cnt = 0;

        if(n.length() == 0){
            System.out.println(lang);
            cnt++;
        }

        for (int i = 0; i < n.length(); i++) {
            cnt += permutation(lang + n.charAt(i), n.substring(0, i) + n.substring(i + 1));
        }

        return cnt;


    }

}
