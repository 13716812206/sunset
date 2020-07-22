package com.test.one.utils;

import java.util.ArrayList;
import java.util.List;

public class test{

    public static void main(String[] args) {

//        String aa = "welcome to shui&di";
//        String[] s = aa.split(" ");
//        System.out.println(s[0]);
//        System.out.println(s[1]);
//        System.out.println(s[2]);
//        int i = 0;
//        for (String str : s) {   i++;
//            if (s.length == i) {
//                System.out.println(str);
//                String[] bb = str.split("&");
//                for (String qq : bb) {
//                    System.out.print(qq);
//                }
//            }
//
//        }
//
//        test2();
        test3();
//        quickSort();

    }
    public static void test1() {

        int[] shuzi = new int[]{5, 6, 4, 2, 7, 9, 0};

        for (int i = 0; i < shuzi.length - 1; i++) {
//            System.out.println(shuzi.length);
            for (int j = 0; j < shuzi.length - 1 - i; j++) {
                if (shuzi[j] < shuzi[j + 1]) {

                    int temp = shuzi[j];
                    shuzi[j] = shuzi[j + 1];
                    shuzi[j + 1] = temp;
                }
            }
        }
        for (int aa : shuzi
        ) {
            System.out.print(aa + ",");
        }

    }

    public static void quickSort() {
        int[] num={3,45,78,64,52,11,64,55,99,11,18};
        quickSort1(num,0,num.length-1);
        arrayToString(num);
    }

    public static void quickSort1(int[] num1,int left,int right){

        if (left>=right){
            return;
        }
        int key=num1[left];
        int i=left;
        int j=right;
        while(i<j){
            while(num1[j]>=key&&i<j){
                j--;
            }
            while(num1[i]<=key&&i<j){
                i++;
            }
            if(i<j){
                int temp=num1[j];
                num1[j]=num1[i];
                num1[i]=temp;
            }
        }
        num1[left]=num1[i];
        num1[i]=key;
        quickSort1(num1,left,i-1);
        quickSort1(num1,i+1,right);
    }
    private static void arrayToString(int[] arr ){
        for(int a : arr) {
            System.out.print(a+"   ");
        }

    }

    public static void test2() {

    List list =new ArrayList<Integer>();
        for(int i=1;i<=1000;i++) {
            int aa=0;
            for (int j=1;j<i;j++){
                if(i%j==0){
                        aa+=j;
                    if(aa==i){
                        list.add(aa);
                    }
                }

            }
        }
        System.out.println(list.size()+"==================");
        for(int c=0;c<list.size();c++){

            System.out.println(list.get(c));
        }
    }

    public static void test3(){


        for(int i=100;i<=999;i++){
            int b=i/100;
            int c=i/10%10;
            int d=i%10;


            if(Math.pow(b,3)+Math.pow(c,3)+Math.pow(d,3)==i){
                System.out.println(i+"================");
            }
        }
    }
}
