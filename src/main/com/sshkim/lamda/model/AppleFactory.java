package main.com.sshkim.lamda.model;

/**
 * Created by sshkim on 2016. 10. 14..
 */
public interface AppleFactory<A extends Apple> {
    A create(String color, int weight);
}
