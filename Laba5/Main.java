package com.company;
import com.company.List.*;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число элементов");
        int count=scanner.nextInt();
        MyList first=null;
        Random random=new Random();
        for (int i=0;i<count;i++){
            int tmp=random.nextInt(1000);
            System.out.println("Element: "+tmp);
            first=ListOperations.insert1(first,tmp);
        }

        MyList p=ListOperations.filter(first);
        System.out.println("Элементы, кратные трем");
       print(p);
        p=null;

        try{
            int rezult=ListOperations.reduce(ListOperations.maprecurse(ListOperations.filter(first)));
            System.out.println("произведение элементов, кратных трем "+rezult);
        }catch (NullPointerException ex){
            System.out.println("Нет таких значений");
        }


    }
    static void print(MyList p){
        while (p!=null){
            System.out.println(p.getValue());
            p=p.getNext();
        }
    }
}
