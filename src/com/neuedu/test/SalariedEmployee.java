package com.neuedu.test;


public class    SalariedEmployee extends ColaEmployee {
    private int salary;
    public SalariedEmployee(int salary,String name,int month){
        super(name,month);
        this.salary=salary;
    }
    @Override
    public double getSalary(int month) {
        return salary;
    }
}
