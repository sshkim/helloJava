package main.com.sshkim.dataStructure;

/**
 * Created by sshkim on 2016. 10. 24..
 */
public class List {

    int[] intList = {1, 2, 3, 4, 5, 6};
    int size = intList.length;

    public static void main(Practice1[] args){
        List list = new List();

        System.out.println(list.get(6));

    }

    public int get(int index){
        int i = size-1-index;

        return intList[i];
    }
}
