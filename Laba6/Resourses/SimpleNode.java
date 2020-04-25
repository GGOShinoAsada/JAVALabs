package Resourses;

public class SimpleNode implements ANode {
    public final int value;
    public SimpleNode(int value){
        this.value=value;
    }
   @Override public int calculate(){
        return value;
    }
}
