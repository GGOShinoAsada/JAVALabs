package com.company.List;
public class ListOperations {

    public static MyList insert1(MyList first, int value){
        MyList p=new MyList(value);//получить начало

        {
            p.SetNextElement(first);//перезаписать Next значением первого
        }
        return p;
    }
    public static MyList filter(MyList first){
        MyList p=null;
        while (first!=null){
            if (first.getValue()%3==0) {
                //System.out.println(first.getValue());
                p=insert1(p,first.getValue());

            }
            first=first.getNext();
        }
        return p;
    }

    public  static  MyList maprecurse(MyList first){

        MyList temp=null;

       if (first!=null){
                 temp=first.getNext();//переменной промежуточной присвоить значение следуючего в списке
                 maprecurse(temp);//рекурсивно вызвать метод
       }
       return first;
    }



    public static int reduce(MyList first){
        int pr=1;
        while ( first!=null){
            pr*=first.getValue();
            first=first.getNext();
        }
        return pr;
    }

}
