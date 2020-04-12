package com.company.resourses;
public class MaxCheck implements Icheck{ public static String S;
public MaxCheck(String str){
S=str;
}
//get string default public boolean check(){
return method(S);
}
//get override string public boolean check(String s){
return method(s);
}
boolean method(String str){
boolean b;
b=false;
a1:for (int i=0;i<str.length()-1;i++){
for (int j=i+1;j<str.length();j++){
if (str.charAt(i)>=str.charAt(j)){
b=true;
}else{
b=false;
break al;
}
}
}
return b;
}
}
