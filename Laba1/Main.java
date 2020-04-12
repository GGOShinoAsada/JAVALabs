package com.company;
import java.util.Scanner;
public class Main {
private static int M, N;
public static void main(String[] args) {
read();
System.out.println("Геометрическая прогрессия");
for (int i=0;i<=N;i++){
System.out.println(Math.pow(M,i));
}
}
static void read(){
Scanner in=new Scanner(System.in);
System.out.println("7. Вывести все элементы геометрической прогрессии"); System.out.println("Ввеgите число - расмер геометрической прогрессии");
M=in.nextInt();
System.out.println("BeeguTe степень геометрической прогрессии");
N=in.nextInt();
}
}
