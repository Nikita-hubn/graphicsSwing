package com.company;

public class HorizantalParabola {
    public double x0;
    public double y0;
    public double a;

    public HorizantalParabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isPointRightOfHorizantalParabola(double x, double y) {
        return x > a * Math.pow(y - y0, 2) + x0;
    }
    public boolean isPointHigherOfHorizantalParabola(double x, double y) {return y  > Math.sqrt((x-x0)/a) + y0 ;}
}
