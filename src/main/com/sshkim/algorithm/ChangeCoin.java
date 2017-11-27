package main.com.sshkim.algorithm;

import java.util.Scanner;

/**
 * Created by sshkim on 2016. 10. 20..
 */

// TODO > Next Time
public class ChangeCoin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("코인을 입력하세요.");
        int coin = scanner.nextInt();
        int[] list = {1, 5, 10, 25, 30, 50};

        ChangeCoin changeCoin = new ChangeCoin();
        System.out.println(changeCoin.changeCoin(list, 0, coin));

    }

    private int changeCoin(int[] arr, int start, int value) {

        if (value == 0)
            return 1;

        if (arr.length == start)
            return 0;

        int total = 0;
        for (int i = 0; i * arr[start] <= value; i++) {
            total += changeCoin(arr, start + 1, value - i * arr[start]);
        }

        return total;
    }
}
