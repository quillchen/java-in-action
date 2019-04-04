package com.quill.action.thinking.genericity15;

import javafx.util.Pair;

/**
 * Created by chenqg18662 on 2019/4/4.
 */
public class TupleTest {

    public static void main(String[] args) {
        TwoTuple<String, Integer> two = getTwo();
        System.out.println(two);
        Pair<String, Long> pair = getPair();
        System.out.println(pair);
    }

    public static TwoTuple<String,Integer> getTwo(){
        TwoTuple<String, Integer> twoTuple = new TwoTuple<>("keyInt",998);
        return twoTuple;
    }

    public static Pair<String,Long> getPair(){
        Pair<String, Long> pair = new Pair<>("keyLong",12345L);
        return pair;
    }
}
