package com.neuedu.test;

/**
 * Created by w on 2020/2/11.
 */
//  有1 2 3 4 四个数字能组成多少个不相同且无重复数字的三位数？  都是多少？
public class Kaoshiti01 {
    public static void main(String[] args) {
        int num=0;
        int[] array = {1,2,3,4};
        for (int i:array){
            for (int j:array){
                for (int k:array){
                    if (i!=j&&i!=k&&j!=k){
                        num++;
                        int sum=i*100+j*10+k;
                        System.out.println(sum);
                    }
                }
            }
        }
        System.out.println(num);
    }
}
