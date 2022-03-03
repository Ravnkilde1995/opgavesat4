package com.company;

import java.util.Arrays;

public class Opgave3 {

public static void main (String[]args){
    int[] myArray = { 1, 6423, 64, 6, 3, 123, 61, 6, 36, 1236, 347, 3, 1326, 246, 4 };
    sortArray(myArray);

}
public static void sortArray(int[] ole){
    System.out.println("Arrays before sort: "+Arrays.toString(ole));
    Arrays.sort(ole);
    System.out.println("Sortet array: "+Arrays.toString(ole));
}

}
