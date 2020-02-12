package com.neuedu.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class TestArrayListLinkedList {

    public static void main(String[] args) {
        List arraylist = new ArrayList();
        List linkedlist = new LinkedList();
        Date startarraylist = new Date();
        for (int i = 0; i <= 100000; i++) {
            arraylist.add(i);
        }
        Date endarraylist = new Date();
        System.out.println("ArrayList填加所用时间=" + (endarraylist.getTime()-startarraylist.getTime()));

        Date startlinkdelist = new Date();
        for (int i = 0; i <= 100000; i++) {
            linkedlist.add(i);
        }
        Date endlinkedlist = new Date();
        System.out.println("LinkedList填加所用的时间="+(endlinkedlist.getTime()-startlinkdelist.getTime()));

        Date startreadarraylist = new Date();
        for (int i = 0;i<arraylist.size();i++){
            Object obj = arraylist.get(i);
        }
        Date endreadarraylist = new Date();
        System.out.println("ArrayList读取所用的时间="+(endreadarraylist.getTime()-startreadarraylist.getTime()));

        Date startreadlinkedlist = new Date();
        for (int i = 0;i<linkedlist.size();i++){
            Object obj = linkedlist.get(i);
        }
        Date endreadlinkedlist = new Date();
        System.out.println("LinkedList读取所用的时间="+(endreadlinkedlist.getTime()-startreadlinkedlist.getTime()));

    }

}
