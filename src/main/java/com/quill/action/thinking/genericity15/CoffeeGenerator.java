package com.quill.action.thinking.genericity15;

import java.util.Random;

/**
 * Created by chenqg18662 on 2019/4/4.
 */
public class CoffeeGenerator implements Generator<Coffee>{

    public static void main(String[] args) {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for (int i = 0; i <5; i++) {
            System.out.println(coffeeGenerator.next());
        }
    }

    private Class[] types={Latte.class,Mocha.class};

    private static Random random=new Random(47);

    public CoffeeGenerator() {}

    private int size=0;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
