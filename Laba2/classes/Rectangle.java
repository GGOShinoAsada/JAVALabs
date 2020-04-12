package com.company.classes;
import com.company.Main;
public class Rectangle extends Main {
public double A_x,B_x,C_x,D_x;
public double A_y,B_y,C_y,D_y;
double S;
public Rectangle(double A_x, double A_y, double C_x, double C_y){
this.A_x=A_x;
this.A_y=A_y;
this.C_x=C_x;
this.C_y=C_y;
this.B_x=A_x;
this.B_y=C_y;
this.D_x=C_x;
this.D_y=A_y;
}
public double GetSquare(){
S=(D_x-A_x)*(B_y-A_y);
return S;
}
}
