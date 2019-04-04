package com.quill.action.thinking.genericity15;

/**
 * Created by chenqg18662 on 2019/4/4.
 */
public class TwoTuple<A,B> {

    public final A first;

    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
