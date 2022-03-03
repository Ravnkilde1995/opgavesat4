package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Opgave1 {

    private static void setUp(Integer[] intArray) {
        Scanner console = new Scanner(System.in);
        // Indsæt int Array

        boolean running = true;

        while (running) {
            System.out.println("Velkommen til menuen");
            System.out.println("Tryk 1 for at printe array");
            System.out.println("Tryk 2 for at sortere array");
            System.out.println("Tryk 3 for at afslutte");

            int svar = 0;

            svar = console.nextInt();

            switch(svar) {
                case 1:
                    printArray(intArray);
                    break;
                case 2:
                    sortArray(intArray);
                    break;
                case 3:
                    running = false;
                    break;
            }
        }
    }

    //method to print array
    private static void printArray(Integer[] intArray){
        System.out.println("Array contents printed through metod: ");
        //print individual elements of array using enhanced for loop
        for(Integer val: intArray){
            System.out.println(val+" ");
        }
    }

    public static void sortArray(Integer[] intArray) {

        System.out.println("Array before sort: " + Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {

            for (int j = i + 1; j < intArray.length; j++) {

                int tmp = 0;

                if (intArray[i] > intArray[j]) {

                    tmp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = tmp;

                }
            }

            System.out.print(intArray[i] + " ");
        }
    }
    public static void main(String[] args) {
        //integer array
        Integer[] intArray ={8, 9, 1, 5, 11, 13 ,7, 4 ,6 ,3 ,12 ,10 ,2};
        //call printArray method by passing intArray as an argument
        printArray(intArray);
        sortArray(intArray);
        setUp(intArray);


    }
}
