package com.company;

import java.util.Random;

public class Opgave4 {
    public static void main(String[]arg){

        int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
        int result=getNumber(arr);
        System.out.println("Her er resultatet: "+result);
        ole(0);
    }


    public static  int getNumber(int[] array){
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
    public static  void ole(int ole){
        System.out.println(ole);
        //substract one
        int res=ole-1;
        if(res>0) {
            System.out.println(res);
        } else {
            System.out.println("input are lower then 0");
        }

    }
}

