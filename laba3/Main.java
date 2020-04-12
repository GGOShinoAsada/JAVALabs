package com.company;
import com.company.resourses.MaxCheck;
import com.company.resourses.MinCheck;
import j ava.util .Scanner;
public class Main {
public static void main(String[] args) {
System.outprintln("BeeguTe сттроку для проверки");
Scanner scanner=new Scanner(System.in);
String teststring="";
do{
teststring=scanner.next();
}
while (iscorrectinput(teststring));
MaxCheck maxCheck=new MaxCheck(teststring);
MinCheck minCheck=new MinCheck(teststring);
if (maxCheck.check())
System.out.println("CTopka является возрастающей");
else if (minCheck.check()){
System.outprintln("CTOpka является убывавающей");
}
else{
System.out.println("Строка не содержит последовательно возрастающих/убывающих символов");
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
System.out.println("noBTuopuTe ввод, введенная строка должна состоять только из английских символов");
}
return b;
}
}
