package main.com.sshkim.lamda.model;

/**
 * Created by sshkim on 2016. 10. 8..
 */

public class Apple {

    private String color = null;
    private int weight = 0;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Apple(Integer integer) {}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public static boolean isHeavyApple(Apple apple) {
        if(apple.getWeight() > 150)
            return true;

        return false;
    }
}
