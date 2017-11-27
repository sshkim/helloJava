package main.com.sshkim.algorithm;

/**
 * Created by sshkim on 2017. 5. 2..
 */
public class ListSpin {

    public static void main(String[] args) {
        String input = "1 10 20 30 40 50";

        String result = spin(input);

    }

    private static String spin(String input) {
        String[] inputArr = input.split(" ");
        Integer moveCnt = Integer.valueOf(inputArr[0]);

        String[] newInputArr = new String[inputArr.length - 1];
        System.arraycopy(inputArr, 1, newInputArr, 0, inputArr.length - 1);

        int cnt = newInputArr.length;
        boolean isPlus = moveCnt < 0;
        StringBuilder sb = new StringBuilder();

        if (isPlus) {
            for (int i = 0; i < cnt; i++) {
                int start = moveCnt % cnt;
                sb.append(inputArr[start]);
                moveCnt++;
            }
        } else {
            for (int i = 0; i < cnt; i++) {

            }
        }

        return sb.toString();
    }
}
