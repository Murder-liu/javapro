package com.neuedu.test;

public class TestColaEmployee {
    public static void main(String[] args) {
//         SalariedEmployee的工资
        SalariedEmployee salariedEmployee=new SalariedEmployee(6000,"张三",3);
        System.out.println(salariedEmployee.getSalary(2));
//          SalesEmployee 的工资
        SalesEmployee salesEmployee = new SalesEmployee("zhangsan",100000,0.3,2);
        System.out.println(salesEmployee.getSalary(2));
//          HourlyEmployee 的工资
        HourlyEmployee hourlyEmployee= new HourlyEmployee(12,20,"LIS",3);
        System.out.println(hourlyEmployee.getSalary(3));
    }
    }

