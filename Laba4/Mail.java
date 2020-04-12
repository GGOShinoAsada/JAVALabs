import com .company.TimeT able.Couple;
import com.company.TimeTable.CoupleComparator;
package com.company;
import java.util.*;
public class Main {
public static void main(String[] args) {
ArrayList<Couple> Couples=new ArrayList<>();
int n;
Couple timetable;
Calendar start,end=new GregorianCalendar();
String name="", datastring="";
//SimpleDateFormat format2 = new SimpleDateFormat("gHb dd Месяц MM Год yyyy Время hh:mm");
System.out.println("BeeguTe число лекций");
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for (int i=0;i<n;i++){
System.out.println("BeeguTe начало лекции");
//Couples.sort();
datastring=scanner.next();
//start= initialize(datastring); start=initialize(datastring); System.out.println("Введите окончание лекции"); datastring=scanner.next();
end= initialize(datastring);
System.out.println("Введите название лекции");
name=scanner.next();
timetable=new Couple(start, end,name);
Couples.add(timetable);
//Couples.add()
}
print(Couples);
System.out.println(" СОРТИРОВКА");
sort(Couples);
print(Couples);
}
static void sort(ArrayList<Couple> TimeTables){
Collections.sort(TimeTables, new CoupleComparator());
}
static void print(ArrayList<Couple> TimeTables){
for (Couple t:TimeTables) {
System.out.println("Лекция: "+t.GetName()+"; Начало: "+t.GetStart().getTime()+"; Конец:
"+t.GetEnd().getTime());
}
}
static Calendar initialize(String t){
String[] temp=t.split(";");
String[] data=temp[0].split("/");
String[] time=temp[1].split(":"); int[] intdata=new int[6];
for (int i=0;i<data.length;i++){
intdata[i]=Integer.parseInt(data[i]); }
for (int i=0;i<time.length;i++){ intdata[i+3]=Integer.parseInt(time[i]);
}
if (time.length==2){ intdata[5]=0;
}
Calendar c=new GregorianCalendar(intdata[0],intdata[1],intdata[2],intdata[3],intdata[4], intdata[5]);
return c;
}
}
