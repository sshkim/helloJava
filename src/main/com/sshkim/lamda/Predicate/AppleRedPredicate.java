package main.com.sshkim.lamda.Predicate;

import main.com.sshkim.lamda.model.Apple;

/**
 * Created by sshkim on 2016. 10. 8..
 */
public class AppleRedPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        if(apple.getColor().toLowerCase().equals("red"))
            return true;
        return false;
    }
}
