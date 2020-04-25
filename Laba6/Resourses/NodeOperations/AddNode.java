package Resourses.NodeOperations;

import Resourses.ANode;

public class AddNode implements ANode {
    private final ANode left;
    private final ANode right;
    public AddNode (ANode left, ANode right){
        this.left=left;
        this.right=right;
    }
    @Override public int calculate(){
        int temp = 0;
        if (left.calculate()!=0){
            temp=left.calculate()+right.calculate();
        }
        else {
            temp=right.calculate();
        }
        return temp;
    }
    @Override public String toString(){
        return "("+this.left.calculate()+"+"+this.right.calculate()+")";
    }

}
