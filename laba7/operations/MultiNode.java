package com.company.operations;

import com.company.resourses.Anode;

import java.util.Collection;


public class MultiNode implements Anode {
    private final Collection<Anode> list;
    public MultiNode(Collection<Anode> t){
        this.list=t;
    }



    @Override
    public int calculate() throws Exception {
        int rez=1;
        boolean flag=false;
       for (Anode data:list){
           if (data.calculate()==0){
               rez=0;
               flag=true;
           }
       }
       if (!flag) {
           for (Anode data : list) {
               rez *= data.calculate();
           }
       }
        return rez;
    }

    @Override
    public String toString() {
        String rezult="";
        boolean first=true;
        for(Anode t:list){
            if (!first) rezult+="*";
            first=false;
            rezult+="("+t.toString()+")";
        }
        return rezult;

    }
}
