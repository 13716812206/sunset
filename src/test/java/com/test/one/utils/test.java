package com.test.one.utils;

public class test{

    public static void main(String[] args) {

        String aa = "welcome to shui&di";
        String[] s = aa.split(" ");

        int i = 0;
        for (String str : s) {
            i++;
            if (s.length == i) {
                System.out.println(str);
                String[] bb = str.split("&");
                for (String qq : bb) {
                    System.out.print(qq);
                }
            }

        }

//        boolean aa;
//        if (aa = true) {
//            System.out.println("123123123");
//        }


//        test1();
        quickSort();

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
            while(num1[j]<=key&&i<j){
                j--;
            }
            while(num1[i]>=key&&i<j){
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




}
