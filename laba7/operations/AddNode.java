package com.company.operations;

import com.company.resourses.Anode;

import java.util.Collection;


public class AddNode implements Anode {
    private final Collection<Anode> list;
    public AddNode(Collection<Anode> t){
        this.list=t;
    }

    @Override
    public int calculate() throws Exception {
        int rez=0;
        for (Anode data:list){
            rez+=data.calculate();
        }
        return rez;
    }

    @Override
    public String toString() {
        String rezult="";
        boolean first=true;
        for(Anode t:list){
            if (!first) rezult+="+";
            first=false;
            rezult+="("+t.toString()+")";
        }
        return rezult;

    }
}
