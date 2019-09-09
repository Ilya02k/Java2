package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double arr[];
        int N=0;
        int min=0,max=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Input N(int): ");
        N=in.nextInt();
        arr= new double[N];
        System.out.println("Input the elements of array: ");
        for(int i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if (arr[i]>arr[max])
            {
                max=i;
            } else if (arr[i] < arr[min])
            {
                min=i;
            }
        }
        double a=arr[max];
        arr[max]=arr[min];
        arr[min]=a;
        System.out.println("Array after change: ");
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
