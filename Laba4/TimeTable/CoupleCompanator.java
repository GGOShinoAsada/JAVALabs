package com.company.TimeTable;
import j ava.util.Comparator;
public class CoupleComparator implements Comparator {
@Override
public int compare(Object o1, Object o2) {
Couple t1=(Couple) o1;
Couple t2=(Couple) o2;
int
rez=Long.toString(t1.GetStart().getTimeInMillis()).compareTo(Long.toString(t2.GetStart().getTimeIn Millis()));
if (rez!=0){
return rez;
}
rez=Long.toString(t1.GetEnd().getTimeInMillis()). compareTo(Long.toString(t2.GetEnd().getTimeIn
Millis()));
return rez;
}
}
