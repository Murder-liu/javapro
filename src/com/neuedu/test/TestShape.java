package com.neuedu.test;

public class TestShape {
    public static void main(String[] args) {
//           Rectangle的 面积周长颜色
        Rectangle rectangle = new Rectangle(100,60, "绿色");
        rectangle.showAll();
        //           Rectangle的 面积周长颜色
        Circle circle = new Circle(15,"蓝色");
        circle.showAll();
    }
}
