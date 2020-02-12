package com.neuedu.test;

import java.awt.*;


public abstract class  Shape {
        private double area;
        private double per;
        private String color;
        public Shape(){}
        public Shape(String color){
            this.color=color;
        }
        public String getColor(){
                return color;
        }
        public abstract  double getArea();
        public  abstract double  getPer();
        public abstract void showAll();


}


