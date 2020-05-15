package com.company.operations;

import com.company.resourses.Anode;

import java.util.Collection;


public class SubstractNode implements Anode {
    private final Collection<Anode> list;
    public SubstractNode(Collection<Anode> t){
        this.list=t;
    }



    @Override
    public int calculate() throws Exception{
        int rez=0;
        int i=0;
        for (Anode data:list){
            if (i==0) {
                rez=data.calculate();
                i++;
            }
            else {
                rez-=data.calculate();
            }
        }

        return rez;
    }

    @Override
    public String toString() {
        String rezult="";
        boolean first=true;
        for(Anode t:list){
            if (!first) rezult+="-";
            first=false;
            rezult+="("+t.toString()+")";
        }
        return rezult;

    }
}
