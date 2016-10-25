package main.com.sshkim.algorithm;

import org.junit.Assert;

/**
 * Created by sshkim on 2016. 10. 24..
 */
public class Practice1 {

    private char[] value;

    public static void main(String[] args) {
        Practice1 practice = new Practice1("abcae");


        Assert.assertEquals(true, practice.equals("abcae"));
        Assert.assertEquals(98, practice.word());

    }

    public Practice1(String string) {
        this.value = string.toCharArray();
    }

    /**
     * 문자열 비교 메소드.
     * <p>
     * 문자열이 같은 경우 true, 다른경우 false
     */
    public boolean equals(String s) {
        if (value.length != s.length()) {
            return false;
        }

        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (value[i] != ch[i]) return false;
        }

        return true;
    }


    /**
     * 모든 문자를 검사하여 중복이 안되는 첫번째 문자를 return
     * <p>
     * Input : abcae
     * Ouput : b
     */
    public char word() {
        boolean flag;
        for (int i = 0; i < value.length; i++) {
            flag = false;
            for (int j = 0; j < value.length; j++) {
                if (value[i] == value[j] && i != j) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return value[i];
        }

        return 0;
    }
}
