package main.com.sshkim.dataStructure;

import main.com.sshkim.dataStructure.Practice1;

/**
 * Created by sshkim on 2016. 10. 24..
 */
public class ArrayList {

    public Object[] objects = new Object[100];
    public int size = 0;

    public static void main(Practice1[] args) {

    }

    public void add(Object object) {
        objects[size] = object;
        size++;
    }

    public void add(int index, Object object) {

        for (int i = size - 1; i >= index; i--) {
            objects[i + 1] = objects[i];
        }

        objects[index] = object;
        size++;

    }

    public void remove(int index) {

        for (int i = index + 1; i < size - 1; i++) {
            objects[i - 1] = objects[i];
        }
        size--;
        objects[size] = null;

    }

    public Object get(int index){
        return objects[index];
    }

    public int size() {
        return this.size;
    }
}
