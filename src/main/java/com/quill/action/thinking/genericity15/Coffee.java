package com.quill.action.thinking.genericity15;

/**
 * Created by chenqg18662 on 2019/4/4.
 */
public class Coffee {
    private static long counter=0;
    private final long id=counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName()+" "+id;
    }
}
