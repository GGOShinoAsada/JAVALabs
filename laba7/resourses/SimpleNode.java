package com.company.resourses;

public class SimpleNode implements Anode {
    private final int value;
    public SimpleNode (int num){
        this.value=num;
    }

    @Override
    public int calculate() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
