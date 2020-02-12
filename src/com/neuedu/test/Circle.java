package com.neuedu.test;


public class  Circle extends Shape{
    private double ridius;
    public Circle( double ridius,String color){
        super(color);
        this.ridius=ridius;

    }


    @Override
    public double getArea() {
        return 3.14*ridius*ridius;
    }

    @Override
    public double getPer() {
        return 2*3.14*ridius;
    }

    @Override
    public void showAll() {
        System.out.println("圆的面积="+getArea());
        System.out.println("圆的周长="+getPer());
        System.out.println("圆的颜色="+getColor());

    }
}
