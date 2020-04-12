package com.company;
import com.company.classes.Line;//1 class
import com.company.classes.Power;//2 class
import j ava.util .Scanner;
public class Main {
public static void main(String[] args)
{
new Main().run();
}
private void run(){
System.outprintln("BeeguTe координату 1 точки");
double x_s_c,y_s_c,c,x_e_c,y_e_c,len;
Scanner scanner=new Scanner(System.in);
x_s_c=scanner.nextDouble();
y_s_c=scanner.nextDouble();
Power power1=new Power(x_s_c,y_s_c);
System.out.println("BeeeguTe координату 2 точки"); x_e_c=scanner.nextDouble(); y_e_c=scanner.nextDouble();
Power power2 =new Power(x_e_c,y_e_c);
Line line=new Line(x_s_c,y_s_c,x_e_c,y_e_c);
System.out.println("--REZULT--");
System.out.println("power1 is located in "+power1.x+"; "+power1.y);
System.out.println("power2 is located in "+power2.x+"; "+power2.y);
System.out.println("line length is "+line.length);
}
}
