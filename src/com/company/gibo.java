package com.company;

import java.util.Scanner;

public class gibo {
    private static Scanner s = new Scanner(System.in);
    private static int [] baseData= new int[10];
    
    public static  void main(String[] args){
        System.out.println("enter 10 intergers:");
        getInput();
        resizeArray();
//        System.out.println("Enter 12 integers:");
//        getInput();
        baseData[10] = 67;
        baseData[11] = 34;
        printArray(baseData);
        
    }

    private static void resizeArray() {
    }


    private static void getInput()
    {
        for (int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt();
    }
    private static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }
}
