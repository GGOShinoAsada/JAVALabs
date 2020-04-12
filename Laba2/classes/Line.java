package com.company.classes;
public class Line extends Main {
public double p_start_x,p_start_y,p_end_x,p_end_y;
public double length;
public Line(double x_s, double y_s, double x_e, double y_e){
this.p_start_x=x_s;
this.p_start_y=y_s;
this.p_end_x=x_e;
this.p_end_y=y_e;
getlength();
}
private void getlength(){ length=Math.sqrt(Math.pow(p_end_x-p_start_x,2)+Math.pow(p_end_y-p_start_y,2));
}
}
