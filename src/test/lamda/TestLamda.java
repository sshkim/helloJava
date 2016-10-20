package test.lamda;

import main.com.sshkim.lamda.Predicate.ApplePredicate;
import main.com.sshkim.lamda.Predicate.AppleRedPredicate;
import main.com.sshkim.lamda.model.Apple;
import main.com.sshkim.lamda.model.AppleFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Created by sshkim on 2016. 10. 8..
 */
public class TestLamda {

    private List<Apple> inventory = new ArrayList<>();
    private List<Apple> result;

    public static List<Apple> filterHeavyApples(List<Apple> inventory, Predicate<Apple> p) {

        List<Apple> listApples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                listApples.add(apple);
            }
        }

        return listApples;
    }

    public static List<Apple> filterApple(List<Apple> inventory, ApplePredicate p) {

        List<Apple> listApples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                listApples.add(apple);
            }
        }

        return listApples;
    }

    @Before
    public void configure(){
        Apple apple = new Apple("red", 100);
        inventory.add(apple);

        apple = new Apple("green", 200);
        inventory.add(apple);
    }


    @Test
    public void test() {
//        result = filterHeavyApples(inventory, Apple::isHeavyApple);
        result = filterHeavyApples(inventory, (Apple a) -> a.getWeight() > 150);
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void testStream(){
//        result = inventory.stream()
//                .filter(p -> new AppleRedPredicate().test(p))
//                .collect(Collectors.toList());

        result = filterApple(inventory, new AppleRedPredicate());

        Assert.assertEquals(1, result.size());

    }

    @Test
    public void testSort(){
        inventory.stream().forEach(i -> System.out.println(i.getColor()));

        inventory.sort((Apple a, Apple b) -> a.getColor().compareTo(b.getColor()));

        inventory.stream().forEach(i -> System.out.println(i.getColor()));
    }

    @Test
    public void testIntPredicate(){

        // 박싱 없음
        IntPredicate evenNumbers = (int i) -> i % 2 == 0;
        System.out.println(evenNumbers.test(1000));

        // 박싱
        Predicate<Integer> oddNumbers = (Integer i) -> i % 2 == 1;
        System.out.println(oddNumbers.test(1000));

    }

    @Test
    public void testConstructReferences(){
        List<Integer> weights = Arrays.asList(7, 3, 4, 10);
        List<Apple> apples = map(weights, Apple::new);
    }

    private List<Apple> map(List<Integer> list, Function<Integer, Apple> function) {
        List<Apple> result = new ArrayList<>();

        for(Integer e: list){
            result.add(function.apply(e));
        }
        return result;
    }

    // TODO - 1
    @Test
    public void testFactory(){
        AppleFactory<Apple> appleFactory = Apple::new;
        Apple apple = appleFactory.create("green", 100);
    }


}


