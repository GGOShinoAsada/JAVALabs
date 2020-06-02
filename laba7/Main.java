package com.company;

import com.company.operations.AddNode;
import com.company.operations.MultiNode;
import com.company.operations.SubstractNode;
import com.company.resourses.Anode;
import com.company.resourses.Mnode;
import com.company.resourses.SimpleNode;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
	   System.out.println("лаба 7");
       Mnode first=example2();
         try {
             System.out.print("("+first.getLeft().toString()+")*("+first.getRight().toString()+")="+first.calculate());
         }
         catch (ArithmeticException ex){
             System.out.println("Деление на 0");
        } catch (Exception e) {
             e.printStackTrace();
         }


    }
   private static Mnode generatefirst(){
        ArrayList<Anode> t1=new ArrayList<>();
        t1.add(new SimpleNode(5));
        t1.add(new SimpleNode(5));
        ArrayList<Anode> t2=new ArrayList<>();
        t2.add(new SimpleNode(1));
        t2.add(new SimpleNode(1));
        SubstractNode l=new SubstractNode(t1);
        AddNode r=new AddNode(t2);
        return new Mnode (new SubstractNode(t1), new AddNode(t2));

   }
   private static Mnode example1() throws Exception {
        ArrayList <Anode> t1=new ArrayList<>();
        t1.add(new SimpleNode(5));
        t1.add(new SimpleNode(5));
       SubstractNode l=new SubstractNode(t1);
       t1=new ArrayList<>();
       t1.add(new SimpleNode(3));
       t1.add(new SimpleNode(1));
       SubstractNode r=new SubstractNode(t1);
       t1=new ArrayList();
       t1.add(new SimpleNode(2));
       AddNode l1=new AddNode(t1);
       t1=new ArrayList<>();
       t1.add(new SimpleNode(3));
       AddNode r1=new AddNode(t1);
       Mnode m1=new Mnode(l,r);
       Mnode m2=new Mnode(l1, r1);
       t1=new ArrayList<>();
       t1.add(new SimpleNode(m1.calculate()));
       MultiNode ml=new MultiNode(t1);
       t1=new ArrayList<>();
       t1.add(new SimpleNode(m2.calculate()));
       MultiNode mr=new MultiNode(t1);
       //System.out.println("("+m1.getLeft().toString()+")*("+m1.getRight().toString()+")="+m1.calculate());
       //System.out.println("("+m2.getLeft().toString()+")*("+m2.getRight().toString()+")="+m2.calculate());
       return new Mnode(ml,mr);
   }
   private static Mnode example2() throws  Exception{
       ArrayList <Anode> t1=new ArrayList<>();
       t1.add(new SimpleNode(5));
       t1.add(new SimpleNode(3));
       SubstractNode l=new SubstractNode(t1);
       t1=new ArrayList<>();
       t1.add(new SimpleNode(3));
       t1.add(new SimpleNode(1));
       SubstractNode r=new SubstractNode(t1);
       t1=new ArrayList();
       t1.add(new SimpleNode(2));
       AddNode l1=new AddNode(t1);
       t1=new ArrayList<>();
       t1.add(new SimpleNode(3));
       AddNode r1=new AddNode(t1);
       Mnode m1=new Mnode(l,r);
       Mnode m2=new Mnode(l1, r1);
       t1=new ArrayList<>();
       t1.add(new SimpleNode(m1.calculate()));
       MultiNode ml=new MultiNode(t1);
       t1=new ArrayList<>();
       t1.add(new SimpleNode(m2.calculate()));
       MultiNode mr=new MultiNode(t1);
       //System.out.println("("+m1.getLeft().toString()+")*("+m1.getRight().toString()+")="+m1.calculate());
       //System.out.println("("+m2.getLeft().toString()+")*("+m2.getRight().toString()+")="+m2.calculate());
       return new Mnode(ml,mr);
   }

}
