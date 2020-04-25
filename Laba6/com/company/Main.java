package com.company;
import Resourses.ANode;
import Resourses.NodeOperations.AddNode;
import  Resourses.NodeOperations.DivideNode;
import Resourses.NodeOperations.SubstractNode;
import Resourses.NodeOperations.MultiNode;
import Resourses.SimpleNode;
public class Main {

    public static void main(String[] args) {
        System.out.println("(5-5)*(3-1)");
        ANode exp1= new SubstractNode(new SimpleNode(5), new SimpleNode(3)), exp2=new SubstractNode(new SimpleNode(3), new SimpleNode(1));
        //оптимизация программы - если левого потомка достаточно для вычислений, то не использовать правого потомка, модернизация узлов Substract, Add, Devide, Multi
        ANode rezult=new MultiNode(
                exp1,
               exp2
        );
        System.out.println("The first expression "+(exp1.toString())+"*"+(exp2.toString())+" is: "+rezult.calculate());//обход левого, правого потомка как в алгоритмае 2
    }
}
