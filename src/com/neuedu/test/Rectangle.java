package com.neuedu.test;


public class Rectangle extends Shape {
//    增加2个属性，width表示长度、height表示宽度
    private double width;
    private   double height;
//增加两个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）
    public Rectangle(){}/* 默认 */

    public Rectangle(double width,double height,String color){
        super(color);
        this.width = width;                     /* 为高度、宽度、颜色赋值 */
        this.height= height;

    }
//  重写getPer、getArea和showAll三个方法
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPer() {
        return 2*(height+width);
    }

    @Override
    public void showAll() {
        System.out.println("矩形面积="+getArea());
        System.out.println("矩形周长="+getPer());
        System.out.println("矩形颜色="+getColor());

    }
}
