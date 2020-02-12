package com.neuedu.test;

/**
 * Created by w on 2020/2/10.
 */
public abstract class ColaEmployee {
    public ColaEmployee(String name,int month){
        this.name=name;
        this.month=month;
    }
    private String name;
    private int month;
    public abstract double getSalary(int month);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
