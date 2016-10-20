package main.com.sshkim.lamda.Predicate;

import main.com.sshkim.lamda.model.Apple;

/**
 * Created by sshkim on 2016. 10. 8..
 */
public class AppleHeavyPredicate implements ApplePredicate {
    final static int heavyWeight = 150;

    @Override
    public boolean test(Apple apple) {
        if(apple.getWeight() > heavyWeight)
            return true;

        return false;
    }
}
