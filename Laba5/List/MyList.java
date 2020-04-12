package com.company.List;
public class MyList {
    private final int value;
    private MyList Next;
    public MyList(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }
    public void SetNextElement(MyList element){
        this.Next=element;
    }

    public MyList getNext() {
        return Next;
    }

}
