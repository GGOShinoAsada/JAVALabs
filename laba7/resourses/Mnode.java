package com.company.resourses;

public class Mnode implements Anode {
    private final Anode left;
    private final Anode right;
    public Mnode(Anode l, Anode r){
        this.left=l;
        this.right=r;
    }

    @Override
    public int calculate() throws Exception {
        return left.calculate()*right.calculate();
    }
    public Anode getLeft(){
        return left;
    }
    public Anode getRight(){
        return right;
    }
}
