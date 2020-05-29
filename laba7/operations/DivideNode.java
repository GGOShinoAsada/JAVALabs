
package com.company.operations;

import com.company.resourses.Anode;

import java.util.Collection;


public class DivideNode implements Anode {
    private final Collection<Anode> list;
    public DivideNode(Collection<Anode> t){
        this.list=t;
    }



    @Override
    public int calculate() throws Exception {
        int rez=1;
        boolean flag=false;
        for (Anode data:list){
            if (data.calculate()==0){
                flag=true;
                throw  new ArithmeticException("Делениме на 0");
            }
        }
        if (!flag) {
            for (Anode data : list) {
                rez /= data.calculate();
            }
        }
        return rez;
    }

    @Override
    public String toString() {
        String rezult="";
        boolean first=true;
        for(Anode t:list){
            if (!first) rezult+="/";
            first=false;
            rezult+="("+t.toString()+")";
        }
        return rezult;

    }
}
