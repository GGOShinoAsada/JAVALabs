package Resourses.NodeOperations;

import Resourses.ANode;

public class DivideNode implements ANode {
    private final ANode left;
    private final ANode right;
    public DivideNode (ANode left, ANode right){
        this.left=left;
        this.right=right;
    }
    @Override public int calculate(){
        int temp = 0;
        if (left.calculate()!=0){
            temp=left.calculate()/right.calculate();
        }
        return temp;
    }
    @Override public String toString(){
        return "("+this.left.calculate()+"/"+this.right.calculate()+")";
    }


}
