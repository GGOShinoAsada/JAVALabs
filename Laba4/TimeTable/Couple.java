package com.company;
import com.company.resourses.MaxCheck;
import com.company.resourses.MinCheck;
import j ava.util .Scanner;
public class Main {
public static void main(String[] args) {
System.outprintln("BeeguTe ������� ��� ��������");
Scanner scanner=new Scanner(System.in);
String teststring="";
do{
teststring=scanner.next();
}
while (iscorrectinput(teststring));
MaxCheck maxCheck=new MaxCheck(teststring);
MinCheck minCheck=new MinCheck(teststring);
if (maxCheck.check())
System.out.println("CTopka �������� ������������");
else if (minCheck.check()){
System.outprintln("CTOpka �������� �����������");
}
else{
System.out.println("������ �� �������� ��������������� ������������/��������� ��������");
}
}
static boolean iscorrectinput (String s){ boolean b=false;
for (int i=0;i<s.length();i++){
char tmp=s.charAt(i);
if ((tmp>='A') && (tmp<=tf)){
b=true;
break;
}
} if (b){
System.out.println("noBTuopuTe ����, ��������� ������ ������ �������� ������ �� ���������� ��������");
}
return b;
}
}
