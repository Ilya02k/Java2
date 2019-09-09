package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double arr[];
        int N=0;
        int count=0;
        double  Z;
        Scanner in= new Scanner(System.in);
        System.out.println("Input N(int) and Z(double): ");
        N=in.nextInt();
        Z=in.nextFloat();
        arr= new double[N];
        System.out.println("Input the elements of array: ");
        for(int i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Array after chage: ");
        for(int i=0;i<N;i++)
        {
            if (arr[i]>Z)
            {
                count++;
                arr[i]=Z;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Count of change: "+count );
    }
}
